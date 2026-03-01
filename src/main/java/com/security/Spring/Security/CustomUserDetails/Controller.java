package com.security.Spring.Security.CustomUserDetails;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/sec")
    public String mss(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        CustomUser user= (CustomUser) authentication.getPrincipal();
        return "Custom User details:"+user.getEmail();
    }

}
