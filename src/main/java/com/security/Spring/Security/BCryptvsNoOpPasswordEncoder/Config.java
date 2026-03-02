package com.security.Spring.Security.BCryptvsNoOpPasswordEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class Config {
    @Bean
    public UserDetailsService service(){
        return new InMemoryUserDetailsManager(User.withUsername("xan")
                .password("xan")
                .roles("xan")
                .build());
    }


}
