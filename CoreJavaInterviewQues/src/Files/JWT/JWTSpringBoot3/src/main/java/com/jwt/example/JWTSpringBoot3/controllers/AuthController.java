package com.jwt.example.JWTSpringBoot3.controllers;

import com.jwt.example.JWTSpringBoot3.entities.User;
import com.jwt.example.JWTSpringBoot3.modals.JWTRequest;
import com.jwt.example.JWTSpringBoot3.modals.JWTResponse;
import com.jwt.example.JWTSpringBoot3.security.JWTHelper;
import com.jwt.example.JWTSpringBoot3.service.CustomUserDetailService;
import com.jwt.example.JWTSpringBoot3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @Autowired
    private AuthenticationManager manager;


    @Autowired
    private JWTHelper helper;

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @PostMapping("/login")
    public ResponseEntity<JWTResponse> login(@RequestBody JWTRequest request) {

        this.doAuthentication(request.getEmail(),request.getPassword());
        UserDetails userDetails = customUserDetailService.loadUserByUsername(request.getEmail());
        String token = this.helper.generateToken(userDetails);
        JWTResponse response = JWTResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername())
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private void doAuthentication(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email,password);
        try {
            manager.authenticate(authentication);
        }catch (BadCredentialsException be) {
            throw new BadCredentialsException("Invalid username or password !!");
        }
    }

}
