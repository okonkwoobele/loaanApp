package com.example.loaanapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AppUserRegistrationResponse {
    private String userId;
    private String message;
    private int status;
}
