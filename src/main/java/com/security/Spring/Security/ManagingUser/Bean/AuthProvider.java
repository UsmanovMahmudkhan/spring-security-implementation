package com.security.Spring.Security.ManagingUser.Bean;

import lombok.SneakyThrows;
import org.jspecify.annotations.Nullable;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AuthProvider implements AuthenticationProvider {
    @SneakyThrows
    @Override
    public @Nullable Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name=authentication.getName();
        String password= String.valueOf(authentication.getCredentials());
        if("alena".equals(name) && "1234".equals(password)){
            return new UsernamePasswordAuthenticationToken(name,password, Arrays.asList());
        }
        else {
            throw new AuthenticationException("Error") {
                @Override
                public String getMessage() {
                    return super.getMessage();
                }
            };
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken
                .class
                .isAssignableFrom(authentication);
    }
}
