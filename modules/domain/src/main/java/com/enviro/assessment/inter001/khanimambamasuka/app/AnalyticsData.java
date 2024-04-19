package com.enviro.assessment.inter001.khanimambamasuka.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "analytics_data")
public class AnalyticsData extends MutableEntity {
    @Serial
    private static final long serialVersionUID = -2700375063879583844L;
    @Column(name = "user_id")
    private String userId;

    private String wasteType;
    private BigDecimal totalWeight;
    private BigDecimal recycledWeight;
    private LocalDateTime dateAnalyzed;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getRecycledWeight() {
        return recycledWeight;
    }

    public void setRecycledWeight(BigDecimal recycledWeight) {
        this.recycledWeight = recycledWeight;
    }

    public LocalDateTime getDateAnalyzed() {
        return dateAnalyzed;
    }

    public void setDateAnalyzed(LocalDateTime dateAnalyzed) {
        this.dateAnalyzed = dateAnalyzed;
    }
}
