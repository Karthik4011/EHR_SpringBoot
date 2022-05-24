package com.example.bartering.repository;

import com.example.bartering.models.notifications;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Notification repository
public interface NotificationsRepository extends JpaRepository<notifications, Integer>{
    public List<notifications> findByUserid(int seller_id);

}
