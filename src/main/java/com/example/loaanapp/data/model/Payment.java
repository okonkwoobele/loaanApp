package com.example.loaanapp.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Payment {
    @Id
   private  String paymentId;
   private  String loanId;
   private String amount;
    private LocalDateTime   timestamp;
}
