package com.security.Spring.Security.UsingManagaer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.security.Spring.Security.UsingManagaer")
public class Config {

//    @Bean
//    public UserDetailsService service(DataSource source){
//        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(source);
//
//        manager.setUsersByUsernameQuery(
//                "SELECT username, password, 1 FROM users WHERE username = ?"
//        );
//        manager.setAuthoritiesByUsernameQuery(
//                "SELECT username, role FROM users WHERE username = ?"
//        );
//
//        return manager;
//    }

    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}