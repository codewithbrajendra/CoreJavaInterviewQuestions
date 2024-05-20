package com.jwt.example.JWTSpringBoot3.repository;

import com.jwt.example.JWTSpringBoot3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    //@Query("select ")
    Optional<User> findByEmail(String email);
}
