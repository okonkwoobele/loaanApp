package com.example.loaanapp.data.repository;

import com.example.loaanapp.data.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {

}
