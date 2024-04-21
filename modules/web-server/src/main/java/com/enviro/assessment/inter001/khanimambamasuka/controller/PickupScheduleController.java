package com.enviro.assessment.inter001.khanimambamasuka.controller;

import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTO;
import com.enviro.assessment.inter001.khanimambamasuka.services.PickupScheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/schedule")
@RestController
public class PickupScheduleController {
    private final PickupScheduleService pickupScheduleService;

    public PickupScheduleController(PickupScheduleService pickupScheduleService) {
        this.pickupScheduleService = pickupScheduleService;
    }

    @GetMapping
    public ResponseEntity<Page<PickupScheduleDTO>> getAllPickupSchedules(Pageable pageable) {
        Page<PickupScheduleDTO> pickupSchedules = pickupScheduleService.getAllPickupSchedules(pageable);
        return ResponseEntity.ok(pickupSchedules);
    }
}
