package com.security.Spring.Security.BCryptvsNoOpPasswordEncoder;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.logging.log4j.Logger;
import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Slf4j
public class BCryptConfig {

    @Bean
    public PasswordEncoder encoder(){
        PasswordEncoder bCrypt=new BCryptPasswordEncoder();
        PasswordEncoder no= NoOpPasswordEncoder.getInstance();

        var bc=bCrypt.encode("Zaybal");
        var noOp=no.encode("Zaybal");
        System.out.println(("BCrypt: "+bc));
        System.out.println("NO: "+noOp);
        return bCrypt;
    }



}
