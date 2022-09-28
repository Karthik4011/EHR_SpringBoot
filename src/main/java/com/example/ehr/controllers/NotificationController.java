package com.example.ehr.controllers;


import com.example.ehr.models.notifications;
import com.example.ehr.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
