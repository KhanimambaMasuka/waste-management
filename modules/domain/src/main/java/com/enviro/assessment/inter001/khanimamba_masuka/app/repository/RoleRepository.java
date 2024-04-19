package com.enviro.assessment.inter001.khanimamba_masuka.app.repository;


import com.enviro.assessment.inter001.khanimamba_masuka.app.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
}
