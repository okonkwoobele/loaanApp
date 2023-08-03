package com.example.loaanapp.dto.request;

import lombok.Data;

@Data
public class AppUserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}



