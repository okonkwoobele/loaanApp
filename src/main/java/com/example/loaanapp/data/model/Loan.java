package com.example.loaanapp.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Loan {
     @Id
   private  String  loanId;
    private String  userId;
    private double  amount;
    private String  interestRate;
    private String  status;
}
