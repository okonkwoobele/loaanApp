package com.example.loaanapp.data.repository;

import com.example.loaanapp.data.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan,String> {
}
