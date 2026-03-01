package com.security.Spring.Security.UsingManagaer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.security.Spring.Security.UsingManagaer")

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
