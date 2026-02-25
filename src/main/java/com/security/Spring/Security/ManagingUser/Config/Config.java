package com.security.Spring.Security.ManagingUser.Config;

//import com.security.Spring.Security.Bean.AuthProvider;
import com.security.Spring.Security.ManagingUser.UserDetails.Car;
import com.security.Spring.Security.ManagingUser.UserDetails.SecurityCar;
import com.security.Spring.Security.ManagingUser.UserDetails.SecurityCarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class Config {

//    public AuthProvider provider;
//
//    public Config(AuthProvider provider) {
//        this.provider = provider;
//    }

    //    @Bean
//    public UserDetailsService userDetails(){
//        var user= User.withUsername("Alena")
//                .authorities("playing")
//                .password("1234")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//
    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }
//
//    @Bean
//    public SecurityFilterChain chain(HttpSecurity http){
//        http.httpBasic(Customizer.withDefaults());
//        http.authorizeHttpRequests(
//                c->c.anyRequest().authenticated()
//        );
//        return http.build();
//    }

//    @Bean
//    public SecurityFilterChain chain(HttpSecurity htpp){
//        htpp.httpBasic(Customizer.withDefaults());
//        htpp.authorizeHttpRequests(c->c.anyRequest().authenticated());
//        htpp.authenticationProvider(provider);
//        var user=User.withUsername("john")
//                .password("111")
//                .authorities("Reader")
//                .build();
//        UserDetailsService service=new InMemoryUserDetailsManager(user);
//        htpp.userDetailsService(service);
//        return htpp.build();
//    }

    @Bean
    public UserDetailsService userDetails(){
        UserDetails u= new SecurityCar(new Car("xan","123","READ"));
        List<UserDetails>userList=List.of(u);
        return new SecurityCarService(userList);
    }
}
