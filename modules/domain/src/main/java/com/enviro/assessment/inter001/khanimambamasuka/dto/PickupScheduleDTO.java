package com.enviro.assessment.inter001.khanimambamasuka.dto;

import java.io.Serial;
import java.time.LocalDateTime;

public class PickupScheduleDTO extends DTO{
    @Serial
    private static final long serialVersionUID = 6738519974723746023L;
    private Long id;
    private String userId;
    private LocalDateTime pickupDate;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}