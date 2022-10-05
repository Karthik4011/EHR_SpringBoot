package com.example.ehr.controllers;


import com.example.ehr.models.doctor;
import com.example.ehr.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
    @Autowired
    DoctorService userService;


    @GetMapping("/doctors")
    public List<doctor> list() {
        return userService.listAllUser();
    }

    @GetMapping("/doctors/{id}")
    public ResponseEntity<doctor> get(@PathVariable Integer id) {
        try {
            doctor user = userService.getUser(id);
            return new ResponseEntity<doctor>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<doctor>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/doctor/login")
    public ResponseEntity<doctor> getByEmail(@RequestBody doctor usr) {
        try {
            doctor user = userService.getUserByEmail(usr.getEmail());
            return new ResponseEntity<doctor>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<doctor>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/doctor/signup")
    public ResponseEntity<doctor> signup(@RequestBody doctor usr) {
        try {
            doctor user = userService.saveUser(usr);
            return new ResponseEntity<doctor>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<doctor>(HttpStatus.NOT_FOUND);
        }
    }

}
