package com.enviro.assessment.inter001.khanimambamasuka.app.repository;

import com.enviro.assessment.inter001.khanimambamasuka.app.Waste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRepository extends CrudRepository<Waste, Long> {
}
