package com.enviro.assessment.inter001.khanimambamasuka.repository;

import com.enviro.assessment.inter001.khanimambamasuka.Waste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRepository extends CrudRepository<Waste, Long> {
}
