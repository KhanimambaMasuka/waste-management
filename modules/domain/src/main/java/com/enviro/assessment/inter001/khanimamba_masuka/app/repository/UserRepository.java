package com.enviro.assessment.inter001.khanimamba_masuka.app.repository;

import com.enviro.assessment.inter001.khanimamba_masuka.app.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
