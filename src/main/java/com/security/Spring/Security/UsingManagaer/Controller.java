package com.security.Spring.Security.UsingManagaer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/sec")
    public String getMss(){
        return "Hello from mysql connected security check";
    }
}
