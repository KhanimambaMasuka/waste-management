package com.enviro.assessment.inter001.khanimamba_masuka.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.math.BigDecimal;

@Entity
@Table(name = "recycling_bin")
public class RecyclingBin extends MutableEntity {

    @Serial
    private static final long serialVersionUID = -5820054770325160506L;
    private String locationName;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String type;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
