package com.jwt.example.JWTSpringBoot3.modals;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JWTResponse {

    private String jwtToken;

    private String username;

}
