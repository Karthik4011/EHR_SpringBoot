package com.example.ehr.service;

import com.example.ehr.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ehr.repository.PatientRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientService {
    @Autowired
    private PatientRepository userRepository;

    public List<patient> listAllUser() {
        return userRepository.findAll();
    }

    public patient getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public patient getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public patient saveUser(patient usr) {
        return userRepository.save(usr);
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }


}
