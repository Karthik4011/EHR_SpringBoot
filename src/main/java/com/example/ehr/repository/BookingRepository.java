package com.example.ehr.repository;

import com.example.ehr.models.booking;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface BookingRepository extends JpaRepository<booking, Integer>{

    public booking findByDoctorid(int doctor_id);

    public booking findByPatientid(int patient_id);

}
