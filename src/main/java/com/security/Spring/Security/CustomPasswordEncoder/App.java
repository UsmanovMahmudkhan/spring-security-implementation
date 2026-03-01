package com.security.Spring.Security.CustomPasswordEncoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = "com.security.Spring.Security.CustomPasswordEncoder")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @GetMapping("/")
    public String mss(){
        return "hihiihhi";
    }
}
