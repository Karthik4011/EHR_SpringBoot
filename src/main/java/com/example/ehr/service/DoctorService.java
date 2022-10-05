package com.example.ehr.service;

import com.example.ehr.models.doctor;
import com.example.ehr.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DoctorService {
    @Autowired
    private DoctorRepository userRepository;

    public List<doctor> listAllUser() {
        return userRepository.findAll();
    }

    public doctor getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public doctor getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public doctor saveUser(doctor usr) {
        return userRepository.save(usr);
    }


}
