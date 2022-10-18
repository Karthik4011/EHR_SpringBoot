package com.example.ehr.controllers;


import com.example.ehr.models.documents;
import com.example.ehr.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DocumentsController {
    @Autowired
    DocumentsService documentsService;


    @GetMapping("/documents")
    public List<documents> list() {
        return documentsService.listAllDocuments();
    }

    @GetMapping("/documents/user/{id}")
    public ResponseEntity<List<documents>> getByDoctorId(@PathVariable Integer id) {
        try {
            List<documents> user = documentsService.getByUserid(id);
            return new ResponseEntity<List<documents>>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<documents>>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/documents")
    public ResponseEntity<documents> signup(@RequestBody documents bkng) {
        try {
            documents book = documentsService.save(bkng);
            return new ResponseEntity<documents>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<documents>(HttpStatus.NOT_FOUND);
        }
    }

}
