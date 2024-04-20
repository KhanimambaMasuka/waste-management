package com.enviro.assessment.inter001.khanimambamasuka.repository;

import com.enviro.assessment.inter001.khanimambamasuka.RecyclingBin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingBinRepository extends CrudRepository<RecyclingBin, Long> {
}
