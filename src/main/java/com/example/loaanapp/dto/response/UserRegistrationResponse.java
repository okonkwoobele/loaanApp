package com.example.loaanapp.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserRegistrationResponse {
    private String id;
    private String message;
    private int statusCode;
}
