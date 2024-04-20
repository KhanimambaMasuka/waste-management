package com.enviro.assessment.inter001.khanimambamasuka.dto;

import com.enviro.assessment.inter001.khanimambamasuka.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        ,unmappedTargetPolicy = ReportingPolicy.ERROR)
public abstract class UserDTOMapper {
    public abstract UserDTO toUserDTO(User user);
}
