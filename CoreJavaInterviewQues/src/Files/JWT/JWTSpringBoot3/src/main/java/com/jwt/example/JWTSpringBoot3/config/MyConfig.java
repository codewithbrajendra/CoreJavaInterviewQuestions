package com.jwt.example.JWTSpringBoot3.config;

import com.jwt.example.JWTSpringBoot3.security.JWTHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyConfig {


    /*@Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails1 = User.builder().username("Brajendra").password(passwordEncoder().encode("Brajendra@23")).roles("ADMIN").build();
        UserDetails userDetails2 = User.builder().username("Shikha").password(passwordEncoder().encode("Shikha@05")).roles("ADMIN").build();
        UserDetails userDetails3 = User.builder().username("Diksha").password(passwordEncoder().encode("Diksha@07")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(userDetails1,userDetails2,userDetails3);
    }*/

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}


