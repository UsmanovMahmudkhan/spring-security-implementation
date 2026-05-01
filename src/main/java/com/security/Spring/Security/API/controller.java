package com.security.Spring.Security.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hi")
    public String sayhiAgain(){
        return "hi again";
    }
}
