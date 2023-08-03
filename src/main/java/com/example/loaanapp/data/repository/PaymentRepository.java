package com.example.loaanapp.data.repository;

import com.example.loaanapp.data.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment,String> {
}
