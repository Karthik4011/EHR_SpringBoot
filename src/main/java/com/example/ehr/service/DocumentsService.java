package com.example.ehr.service;

import com.example.ehr.models.documents;
import com.example.ehr.repository.DocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DocumentsService {
    @Autowired
    private DocumentsRepository bookingRepository;

    public List<documents> listAllDocuments() {
        return bookingRepository.findAll();
    }

    public List<documents> getByUserid(int userid) {
        return bookingRepository.findByUserid(userid);
    }

    public documents save(documents doc) {
        return bookingRepository.save(doc);
    }

    public void delete(int id) {
        bookingRepository.deleteById(id);
    }

}
