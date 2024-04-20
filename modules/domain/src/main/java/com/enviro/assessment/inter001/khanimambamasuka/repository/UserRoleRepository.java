package com.enviro.assessment.inter001.khanimambamasuka.repository;

import com.enviro.assessment.inter001.khanimambamasuka.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}
