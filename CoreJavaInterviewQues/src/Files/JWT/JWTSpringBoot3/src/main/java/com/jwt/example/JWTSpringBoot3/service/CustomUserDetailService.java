package com.jwt.example.JWTSpringBoot3.service;

import com.jwt.example.JWTSpringBoot3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.jwt.example.JWTSpringBoot3.entities.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //load from database

       User user = userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found !!!"));

        return user;
    }
}
