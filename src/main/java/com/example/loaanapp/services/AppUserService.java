package com.example.loaanapp.services;


import com.example.loaanapp.dto.request.AppUserRegistrationRequest;
import com.example.loaanapp.dto.response.AppUserRegistrationResponse;

public interface AppUserService {
    AppUserRegistrationResponse registration(AppUserRegistrationRequest userRegistrationRequest);
}
