package com.enviro.assessment.inter001.khanimambamasuka.services;

import com.enviro.assessment.inter001.khanimambamasuka.PickupSchedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PickupScheduleService {
    Page<PickupSchedule> getAllPickupSchedules(Pageable pageable);

    PickupSchedule save(PickupSchedule pickupSchedule);
}
