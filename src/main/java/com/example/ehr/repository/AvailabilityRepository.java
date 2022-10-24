package com.example.ehr.repository;

import com.example.ehr.models.availability;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface AvailabilityRepository extends JpaRepository<availability, Integer>{

    public availability findByDoctorid(int doctorid);

}
