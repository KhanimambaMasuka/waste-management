package com.enviro.assessment.inter001.khanimambamasuka.dto;

import com.enviro.assessment.inter001.khanimambamasuka.PickupSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.ERROR)
public abstract class PickupScheduleDTOMapper {
    public abstract PickupScheduleDTO toPickupScheduleDTO(PickupSchedule source);

    public Page<PickupScheduleDTO> toPickupScheduleDTOs(Page<PickupSchedule> source) {
        return source.map(this::toPickupScheduleDTO);
    }
}
