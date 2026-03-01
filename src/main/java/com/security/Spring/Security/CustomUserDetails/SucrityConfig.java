package com.security.Spring.Security.CustomUserDetails;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SucrityConfig {

    @Bean
    public UserDetailsService detailsService(){
        var user1=new CustomUser("xan","student","1234","smth@gmail.com");
        var user2=new CustomUser("user2","bekorchi","4321","smth2@gmail.com");
        return new InMemoryUserDetailsManager(user1,user2);

    }

    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
