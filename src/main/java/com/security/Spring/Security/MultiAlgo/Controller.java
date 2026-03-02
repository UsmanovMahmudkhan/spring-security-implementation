package com.security.Spring.Security.MultiAlgo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hi(){
        return "Multi-algo";
    }
}
