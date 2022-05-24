package com.example.bartering.controllers;


import com.example.bartering.models.notifications;
import com.example.bartering.models.users;
import com.example.bartering.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.bartering.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotificationController {
    @Autowired
    NotificationService ntService;


    @PostMapping("/notifications")
    public notifications list(@RequestBody notifications nt) {
        return ntService.save(nt);
    }

    @PostMapping("/getnotifications")
    public List<notifications> lists(@RequestBody notifications nt) {
        return ntService.findBySellerId(nt.getUserid());
    }

}
