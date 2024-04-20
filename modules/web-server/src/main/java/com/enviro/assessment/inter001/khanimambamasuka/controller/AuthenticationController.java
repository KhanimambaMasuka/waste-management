package com.enviro.assessment.inter001.khanimambamasuka.controller;

import com.enviro.assessment.inter001.khanimambamasuka.User;
import com.enviro.assessment.inter001.khanimambamasuka.controller.exchange.LoginResponse;
import com.enviro.assessment.inter001.khanimambamasuka.dto.LoginDTO;
import com.enviro.assessment.inter001.khanimambamasuka.dto.RegisterUserDTO;
import com.enviro.assessment.inter001.khanimambamasuka.dto.UserDTO;
import com.enviro.assessment.inter001.khanimambamasuka.dto.UserDTOMapper;
import com.enviro.assessment.inter001.khanimambamasuka.services.AuthenticationService;
import com.enviro.assessment.inter001.khanimambamasuka.services.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    private final JwtService jwtService;
    private final AuthenticationService authenticationService;
    private final UserDTOMapper userDTOMapper;

    public AuthenticationController(JwtService jwtService
            , AuthenticationService authenticationService
            , UserDTOMapper userDTOMapper) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> register(@RequestBody RegisterUserDTO registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(userDTOMapper.toUserDTO(registeredUser));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginDTO loginDTO) {
        User authenticatedUser = authenticationService.authenticate(loginDTO);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse response = new LoginResponse();
        response.setToken(jwtToken);
        response.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(response);
    }
}