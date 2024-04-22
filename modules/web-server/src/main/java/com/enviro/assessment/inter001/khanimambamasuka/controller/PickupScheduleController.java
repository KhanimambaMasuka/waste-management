package com.enviro.assessment.inter001.khanimambamasuka.controller;

import com.enviro.assessment.inter001.khanimambamasuka.PickupSchedule;
import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTO;
import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTOMapper;
import com.enviro.assessment.inter001.khanimambamasuka.services.PickupScheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/schedule")
@RestController
public class PickupScheduleController {
    private final PickupScheduleService pickupScheduleService;
    private final PickupScheduleDTOMapper pickupScheduleDTOMapper;

    public PickupScheduleController(PickupScheduleService pickupScheduleService
            , PickupScheduleDTOMapper pickupScheduleDTOMapper) {
        this.pickupScheduleService = pickupScheduleService;
        this.pickupScheduleDTOMapper = pickupScheduleDTOMapper;
    }

    @GetMapping
    public ResponseEntity<Page<PickupScheduleDTO>> getAllPickupSchedules(Pageable pageable) {
        Page<PickupScheduleDTO> pickupSchedules =
                pickupScheduleDTOMapper.toPickupScheduleDTOs(
                        pickupScheduleService.getAllPickupSchedules(pageable));
        return ResponseEntity.ok(pickupSchedules);
    }

    @PostMapping("/save")
    public ResponseEntity<PickupScheduleDTO> save(@RequestBody PickupScheduleDTO dto) {
        PickupSchedule save = pickupScheduleService.save(pickupScheduleDTOMapper.toPickupSchedule(dto));
        return ResponseEntity.ok(pickupScheduleDTOMapper.toPickupScheduleDTO(save));
    }
}
