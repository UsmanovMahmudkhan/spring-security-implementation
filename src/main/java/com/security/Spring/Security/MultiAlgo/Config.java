package com.security.Spring.Security.MultiAlgo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password4j.Argon2Password4jPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Slf4j
@ComponentScan("com.security.Spring.Security.MultiAlgo")
public class Config {

    @Bean
    public PasswordEncoder encoder(){
        Map<String,PasswordEncoder>encoders=new HashMap<>();
        encoders.put("bcrypt",new BCryptPasswordEncoder());
        encoders.put("argon2",new Argon2PasswordEncoder(16,32,2,65536,3));
        DelegatingPasswordEncoder delegating =new DelegatingPasswordEncoder("bcrypt", encoders);
        System.out.println(delegating.encode("salom"));
        return delegating;
    }
    @Bean
    public UserDetailsService userDetailsService(DelegatingPasswordEncoder encoder){
        var user= User.withUsername("multialgo").password(encoder.encode("salom")).roles("admin").build();
        return new InMemoryUserDetailsManager(user);
    }
}
