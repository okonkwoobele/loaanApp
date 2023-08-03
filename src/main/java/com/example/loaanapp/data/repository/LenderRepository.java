package com.example.loaanapp.data.repository;

import com.example.loaanapp.data.model.Lender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LenderRepository extends MongoRepository<Lender,String> {
}
