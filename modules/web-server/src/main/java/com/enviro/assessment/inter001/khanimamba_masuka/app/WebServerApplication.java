package com.enviro.assessment.inter001.khanimamba_masuka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//FIXME
@SpringBootApplication(scanBasePackages = {"com.enviro.assessment.inter001.khanimamba_masuka.app.repository"})
public class WebServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServerApplication.class, args);
    }

}
