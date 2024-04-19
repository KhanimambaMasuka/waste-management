package com.enviro.assessment.inter001.khanimamba_masuka.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "waste")
public class Waste extends MutableEntity {
    @Serial
    private static final long serialVersionUID = -7154016193324638117L;
    private String type;
    private BigDecimal weight;
    private LocalDateTime dateCreated;
    private String status;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
