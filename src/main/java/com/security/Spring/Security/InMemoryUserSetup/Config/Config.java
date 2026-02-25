package com.security.Spring.Security.InMemoryUserSetup.Config;

import com.security.Spring.Security.InMemoryUserSetup.Entity.BlogUser;
import com.security.Spring.Security.InMemoryUserSetup.Entity.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.security.Spring.Security.InMemoryUserSetup")
public class Config {

    @Bean
    public UserDetailsService userDetails(){
        var user=new UserService(new BlogUser("alenaxon","1234","admin"));
        var user2 = User.withUsername("khan")
                .authorities("reader")
                .password("111")
                .build();
        return new InMemoryUserDetailsManager(List.of(user,user2));
    }

    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
