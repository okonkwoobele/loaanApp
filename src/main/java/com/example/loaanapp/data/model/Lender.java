package com.example.loaanapp.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Lender {
    @Id
   private  String  lenderId;
   private  String   name;
   private  String  contactInfo;


}



