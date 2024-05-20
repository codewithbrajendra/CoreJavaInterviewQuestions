package com.jwt.example.JWTSpringBoot3.modals;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {


    private String userId;
    private String name;
    private String email;
}
