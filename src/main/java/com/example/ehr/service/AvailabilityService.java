package com.example.ehr.service;

import com.example.ehr.models.availability;
import com.example.ehr.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AvailabilityService {
    @Autowired
    private AvailabilityRepository bookingRepository;

    public List<availability> listAllBookings() {
        return bookingRepository.findAll();
    }


    public availability saveAvailability(availability avi) {
        return bookingRepository.save(avi);
    }

    public void deleteAvi(int id) {
         bookingRepository.deleteById(id);
    }

}
