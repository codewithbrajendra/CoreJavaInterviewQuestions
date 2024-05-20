package com.jwt.example.JWTSpringBoot3.service;

import com.jwt.example.JWTSpringBoot3.entities.User;
//import com.jwt.example.JWTSpringBoot3.modals.User;
import com.jwt.example.JWTSpringBoot3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

     private List<User> store = new ArrayList<>();

     @Autowired
     private UserRepository userRepository;

     @Autowired
     private PasswordEncoder passwordEncoder;

     /*public UserService() {
          store.add(new User(UUID.randomUUID().toString(),"Shikha","Shikha@gmail.com"));
            store.add(new User(UUID.randomUUID().toString(),"Chotu","Chotu@gmail.com"));
            store.add(new User(UUID.randomUUID().toString(),"Mona","Mona@gmail.com"));
            store.add(new User(UUID.randomUUID().toString(),"Diksha","Diksha@gmail.com"));
            store.add(new User(UUID.randomUUID().toString(),"Abhi","Abhi@gmail.com"));
     }*/


     public List<User> getUsers() {
            return userRepository.findAll();
         //return store;
     }

     public User createUser(User user) {
            user.setUserId(UUID.randomUUID().toString());
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
     }
}
