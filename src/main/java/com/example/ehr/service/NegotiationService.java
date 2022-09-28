package com.example.ehr.service;

import com.example.ehr.models.negotiations;
import com.example.ehr.repository.NegotiationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NegotiationService {
    @Autowired
    private NegotiationsRepository negoRepository;

    public List<negotiations> findBySellerId(int id) {
        return negoRepository.findBySellerid(id);
    }

    public List<negotiations> findByReceiverId(int id) {
        return negoRepository.findByReceiverid(id);
    }

    public Optional<negotiations> findById(int id) {
        return negoRepository.findById(id);
    }

    public negotiations saveNego(negotiations it) {
        return negoRepository.save(it);
    }

}
