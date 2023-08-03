package com.example.loaanapp.controller;

import com.example.loaanapp.dto.request.AppUserRegistrationRequest;
import com.example.loaanapp.dto.request.UserRegistrationRequest;
import com.example.loaanapp.dto.response.AppUserRegistrationResponse;
import com.example.loaanapp.dto.response.UserRegistrationResponse;
import com.example.loaanapp.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/appUser")
public class AppUserController {
    @Autowired
    public AppUserService appUserService;

    @PostMapping( "/ ")
    public AppUserRegistrationResponse registration(@RequestBody AppUserRegistrationRequest userRegistrationRequest){
        return appUserService.registration(userRegistrationRequest);
    }

}
