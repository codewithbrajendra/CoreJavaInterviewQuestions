package com.jwt.example.JWTSpringBoot3.controllers;

import com.jwt.example.JWTSpringBoot3.entities.User;
//import com.jwt.example.JWTSpringBoot3.modals.User;
import com.jwt.example.JWTSpringBoot3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeControllers {


    @Autowired
    private UserService userService;

    //http://localhost:8082/home/users
    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("getting users");
        return  userService.getUsers();
    }

    @GetMapping("/user-name")
   public String getUserName(Principal principal) {
        return principal.getName();
   }
}
