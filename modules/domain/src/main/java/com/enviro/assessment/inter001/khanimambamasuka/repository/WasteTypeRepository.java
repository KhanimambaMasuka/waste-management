package com.enviro.assessment.inter001.khanimambamasuka.repository;

import com.enviro.assessment.inter001.khanimambamasuka.WasteType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteTypeRepository extends CrudRepository<WasteType, String> {
}
