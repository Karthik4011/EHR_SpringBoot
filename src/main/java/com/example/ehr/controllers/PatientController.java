package com.example.ehr.controllers;


import com.example.ehr.models.documents;
import com.example.ehr.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ehr.service.PatientService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientController {
    @Autowired
    PatientService userService;


    @GetMapping("/patients")
    public List<patient> list() {
        return userService.listAllUser();
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<patient> get(@PathVariable Integer id) {
        try {
            patient user = userService.getUser(id);
            return new ResponseEntity<patient>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<patient>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/patient/login")
    public ResponseEntity<patient> getByEmail(@RequestBody patient usr) {
        try {
            patient user = userService.getUserByEmail(usr.getEmail());
            return new ResponseEntity<patient>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<patient>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/patient/signup")
    public ResponseEntity<patient> signup(@RequestBody patient usr) {
        try {
            patient user = userService.saveUser(usr);
            return new ResponseEntity<patient>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<patient>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/patient/{id}")
    public ResponseEntity<patient> delete(@PathVariable int id){
        userService.delete(id);
        return new ResponseEntity<patient>(HttpStatus.OK);
    }

}
