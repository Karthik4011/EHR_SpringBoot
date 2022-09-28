package com.example.ehr.controllers;


import com.example.ehr.models.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ehr.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/patients")
    public List<users> list() {
        return userService.listAllUser();
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<users> get(@PathVariable Integer id) {
        try {
            users user = userService.getUser(id);
            return new ResponseEntity<users>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<users>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/login")
    public ResponseEntity<users> getByEmail(@RequestBody users usr) {
        try {
            users user = userService.getUserByEmail(usr.getEmail());
            return new ResponseEntity<users>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<users>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/signup")
    public ResponseEntity<users> signup(@RequestBody users usr) {
        try {
            users user = userService.saveUser(usr);
            return new ResponseEntity<users>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<users>(HttpStatus.NOT_FOUND);
        }
    }

}
