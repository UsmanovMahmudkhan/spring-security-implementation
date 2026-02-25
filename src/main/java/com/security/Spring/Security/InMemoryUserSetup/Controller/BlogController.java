package com.security.Spring.Security.InMemoryUserSetup.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/blog")
    public String getHome(){
        return "Hello, WElcome to Spring";
    }
}
