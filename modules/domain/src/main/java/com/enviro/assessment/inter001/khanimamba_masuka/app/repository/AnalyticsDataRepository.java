package com.enviro.assessment.inter001.khanimamba_masuka.app.repository;

import com.enviro.assessment.inter001.khanimamba_masuka.app.AnalyticsData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsDataRepository extends CrudRepository<AnalyticsData, Integer> {
}
