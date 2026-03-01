package com.security.Spring.Security.CustomPasswordEncoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder encoder(){
        return new CustomPasswordEncoder();

    }

    @Bean
    public UserDetailsService details(){
        InMemoryUserDetailsManager users=new InMemoryUserDetailsManager();
        var user1= User.withUsername("xan").password("123").roles("admin").build();
        users.createUser(user1);
        return users;
    }

}
