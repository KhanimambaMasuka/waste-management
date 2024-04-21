package com.enviro.assessment.inter001.khanimambamasuka.services.impl;

import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTO;
import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTOMapper;
import com.enviro.assessment.inter001.khanimambamasuka.repository.PickupScheduleRepository;
import com.enviro.assessment.inter001.khanimambamasuka.services.PickupScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PickupScheduleServiceImpl implements PickupScheduleService {

    private final PickupScheduleRepository pickupScheduleRepository;
    private final PickupScheduleDTOMapper pickupScheduleDTOMapper;

    public PickupScheduleServiceImpl(PickupScheduleRepository pickupScheduleRepository, PickupScheduleDTOMapper pickupScheduleDTOMapper) {
        this.pickupScheduleRepository = pickupScheduleRepository;
        this.pickupScheduleDTOMapper = pickupScheduleDTOMapper;
    }

    @Override
    public Page<PickupScheduleDTO> getAllPickupSchedules(Pageable pageable) {
        return pickupScheduleDTOMapper
                .toPickupScheduleDTOs(pickupScheduleRepository.findAll(pageable));
    }
}
