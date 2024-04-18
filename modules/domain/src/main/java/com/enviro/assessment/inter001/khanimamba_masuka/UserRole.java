package com.enviro.assessment.inter001.khanimamba_masuka;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "user_roles")
public class UserRole extends MutableEntity {

    @Serial
    private static final long serialVersionUID = 179783302768787463L;
    @Column(name = "user_id")
    private String user;

    @Column(name = "role_id")
    private String roleId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
