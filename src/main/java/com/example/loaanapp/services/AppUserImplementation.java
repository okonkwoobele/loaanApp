package com.example.loaanapp.services;

import com.example.loaanapp.data.model.AppUser;
import com.example.loaanapp.data.repository.AppUserRepository;
import com.example.loaanapp.dto.request.AppUserRegistrationRequest;
import com.example.loaanapp.dto.response.AppUserRegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserImplementation implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public AppUserRegistrationResponse registration(AppUserRegistrationRequest userRegistrationRequest) {
        AppUser appUser = new AppUser();
        appUser.setFirstName(userRegistrationRequest.getFirstName());
        appUser.setLastName(userRegistrationRequest.getLastName());
        appUser.setEmail(userRegistrationRequest.getEmail());
        appUser.setPassword(userRegistrationRequest.getPassword());
        appUserRepository.save(appUser);
        return new AppUserRegistrationResponse(appUser.getUserId(), "User Registration Successful", 201);
    }
}
