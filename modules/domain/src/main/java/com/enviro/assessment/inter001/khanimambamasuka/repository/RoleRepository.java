package com.enviro.assessment.inter001.khanimambamasuka.repository;


import com.enviro.assessment.inter001.khanimambamasuka.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
}
