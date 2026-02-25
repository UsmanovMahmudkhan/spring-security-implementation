package com.security.Spring.Security.InMemoryUserSetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.security.Spring.Security.InMemoryUserSetup")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
