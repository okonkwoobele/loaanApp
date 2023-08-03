package com.example.loaanapp.data.repository;

import com.example.loaanapp.data.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppUserRepository extends MongoRepository<AppUser,String> {

}
