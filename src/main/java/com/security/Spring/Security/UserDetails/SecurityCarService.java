package com.security.Spring.Security.UserDetails;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class SecurityCarService implements UserDetailsService {
    private List<UserDetails> car;

    public SecurityCarService(List<UserDetails> car) {
        this.car = car;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return car.stream()
                .filter(u->u.getUsername().equals(username))
                .findFirst()
                .orElseThrow(()->new UsernameNotFoundException("Not found"));

    }
}
