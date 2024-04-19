package com.enviro.assessment.inter001.khanimambamasuka.app.controller;

import com.enviro.assessment.inter001.khanimambamasuka.app.User;
import com.enviro.assessment.inter001.khanimambamasuka.app.controller.exchange.LoginResponse;
import com.enviro.assessment.inter001.khanimambamasuka.app.services.AuthenticationService;
import com.enviro.assessment.inter001.khanimambamasuka.app.services.JwtService;
import com.enviro.assessment.inter001.khanimambamasuka.app.dto.LoginDTO;
import com.enviro.assessment.inter001.khanimambamasuka.app.dto.RegisterUserDTO;
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

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDTO registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
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