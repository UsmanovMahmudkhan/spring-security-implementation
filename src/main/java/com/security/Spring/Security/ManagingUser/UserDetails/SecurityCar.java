package com.security.Spring.Security.ManagingUser.UserDetails;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


public class SecurityCar implements UserDetails {

    private Car car;


    public SecurityCar(Car car) {
        this.car = car;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(car.getRole()));
    }

    @Override
    public @Nullable String getPassword() {
        return car.getPassword();
    }

    @Override
    public String getUsername() {
        return car.getUsername();
    }
}
