package com.enviro.assessment.inter001.khanimambamasuka.app.repository;

import com.enviro.assessment.inter001.khanimambamasuka.app.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
