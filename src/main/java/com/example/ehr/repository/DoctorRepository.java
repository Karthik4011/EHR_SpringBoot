package com.example.ehr.repository;

import com.example.ehr.models.doctor;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface DoctorRepository extends JpaRepository<doctor, Integer>{

    public doctor findByEmail(String email);

}
