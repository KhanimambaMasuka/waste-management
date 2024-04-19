package com.enviro.assessment.inter001.khanimambamasuka.app.repository;

import com.enviro.assessment.inter001.khanimambamasuka.app.AnalyticsData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsDataRepository extends CrudRepository<AnalyticsData, Integer> {
}
