package com.example.loaanapp.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class Notification {
    @Id
   private  String  notificationId;
   private  String  userId;
   private  String  message;
    private LocalDateTime timestamp;
}
