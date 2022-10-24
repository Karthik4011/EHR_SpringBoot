package com.example.ehr.controllers;


import com.example.ehr.models.booking;
import com.example.ehr.models.patient;
import com.example.ehr.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {
    @Autowired
    BookingService bookingService;


    @GetMapping("/bookings")
    public List<booking> list() {
        return bookingService.listAllBookings();
    }

    @GetMapping("/bookings/doctor/{id}")
    public ResponseEntity<booking> getByDoctorId(@PathVariable Integer id) {
        try {
            booking user = bookingService.getByDoctorId(id);
            return new ResponseEntity<booking>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<booking>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/bookings/patient/{id}")
    public ResponseEntity<booking> getByPatientId(@PathVariable Integer id) {
        try {
            booking user = bookingService.getByPatientId(id);
            return new ResponseEntity<booking>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<booking>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/booking")
    public ResponseEntity<booking> newbooking(@RequestBody booking bkng) {
        try {
            booking book = bookingService.saveUser(bkng);
            return new ResponseEntity<booking>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<booking>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/booking")
    public ResponseEntity<booking> update(@RequestBody booking bkng) {
        try{
            booking book = bookingService.saveUser(bkng);
            return new ResponseEntity<booking>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<booking>(HttpStatus.NOT_FOUND);
        }
    }

}
