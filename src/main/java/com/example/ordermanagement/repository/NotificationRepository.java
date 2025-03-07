package com.example.ordermanagement.repository;

import com.example.ordermanagement.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}