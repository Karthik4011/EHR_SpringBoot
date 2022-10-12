package com.example.ehr.service;

import com.example.ehr.models.booking;
import com.example.ehr.models.patient;
import com.example.ehr.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<booking> listAllBookings() {
        return bookingRepository.findAll();
    }

    public booking getByDoctorId(Integer id) {
        return bookingRepository.findByDoctorid(id);
    }

    public booking getByPatientId(Integer id) {
        return bookingRepository.findByPatientid(id);
    }

    public booking saveUser(booking bkng) {
        return bookingRepository.save(bkng);
    }


}
