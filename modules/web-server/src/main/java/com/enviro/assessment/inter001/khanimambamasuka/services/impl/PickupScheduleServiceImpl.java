package com.enviro.assessment.inter001.khanimambamasuka.services.impl;

import com.enviro.assessment.inter001.khanimambamasuka.PickupSchedule;
import com.enviro.assessment.inter001.khanimambamasuka.User;
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

    public PickupScheduleServiceImpl(PickupScheduleRepository pickupScheduleRepository) {
        this.pickupScheduleRepository = pickupScheduleRepository;
    }

    @Override
    public Page<PickupSchedule> getAllPickupSchedules(Pageable pageable) {
        return pickupScheduleRepository.findAll(pageable);
    }

    @Override
    public PickupSchedule save(PickupSchedule pickupSchedule) {
        User user = Utils.getCurrentUser();
        pickupSchedule.setUserId(user.getId());
        return pickupScheduleRepository.save(pickupSchedule);
    }
}
