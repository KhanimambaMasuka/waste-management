package com.enviro.assessment.inter001.khanimamba_masuka;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "waste_type")
public class WasteType extends ReferenceData{
    @Serial
    private static final long serialVersionUID = -8805925375746644404L;
}
