package com.example.ehr.repository;

import com.example.ehr.models.patient;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface PatientRepository extends JpaRepository<patient, Integer>{

    public patient findByEmail(String email);

}
