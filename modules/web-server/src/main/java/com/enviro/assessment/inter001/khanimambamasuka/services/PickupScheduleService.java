package com.enviro.assessment.inter001.khanimambamasuka.services;

import com.enviro.assessment.inter001.khanimambamasuka.dto.PickupScheduleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PickupScheduleService {
    Page<PickupScheduleDTO> getAllPickupSchedules(Pageable pageable);
}
