package com.security.Spring.Security.CustomUserDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.security.Spring.Security.CustomUserDetails")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
