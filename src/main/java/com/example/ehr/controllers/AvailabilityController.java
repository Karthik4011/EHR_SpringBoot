package com.example.ehr.controllers;


import com.example.ehr.models.availability;
import com.example.ehr.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AvailabilityController {
    @Autowired
    AvailabilityService bookingService;


    @GetMapping("/availability")
    public List<availability> list() {
        return bookingService.listAllBookings();
    }

    @PostMapping("/availability")
    public ResponseEntity<availability> newbooking(@RequestBody availability bkng) {
        try {
            availability book = bookingService.saveAvailability(bkng);
            return new ResponseEntity<availability>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<availability>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/availability/{id}")
    public ResponseEntity<availability> newbooking(@PathVariable int id) {
        try {
            bookingService.deleteAvi(id);
            return new ResponseEntity<availability>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<availability>(HttpStatus.NOT_FOUND);
        }
    }

}
