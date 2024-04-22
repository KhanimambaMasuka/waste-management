package com.enviro.assessment.inter001.khanimambamasuka.services.impl;

import com.enviro.assessment.inter001.khanimambamasuka.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class Utils {
    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
