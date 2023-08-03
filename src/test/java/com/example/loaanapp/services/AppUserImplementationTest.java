package com.example.loaanapp.services;

import com.example.loaanapp.dto.request.AppUserRegistrationRequest;
import com.example.loaanapp.dto.response.AppUserRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppUserImplementationTest {

    @Autowired
    //given
    private AppUserService appUserService;
    @Test
    void testThatUserCanRegister() {
        //when
        AppUserRegistrationRequest userRegistrationRequest = new AppUserRegistrationRequest();
        userRegistrationRequest.setFirstName("Austin");
        userRegistrationRequest.setEmail("Okonkwo.obele@gmail.com");
        userRegistrationRequest.setLastName("okonkwo");
        userRegistrationRequest.setPassword("pastor");
        AppUserRegistrationResponse appUserRegistrationResponse = appUserService.registration(userRegistrationRequest);
        //assert
        assertEquals("User Registration Successful",appUserRegistrationResponse.getMessage());

    }




}