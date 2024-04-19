package com.enviro.assessment.inter001.khanimamba_masuka.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "roles")
public class Role extends ReferenceData {
    @Serial
    private static final long serialVersionUID = -7883133166883893972L;
}
