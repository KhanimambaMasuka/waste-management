package com.enviro.assessment.inter001.khanimambamasuka;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.time.LocalDateTime;

@Entity
@Table(name = "pickup_schedule")
public class PickupSchedule extends MutableEntity {
    @Serial
    private static final long serialVersionUID = -8682923906402042637L;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "pickup_date")
    private LocalDateTime pickupDate;
    private String status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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
