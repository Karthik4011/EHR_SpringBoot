package com.example.bartering.service;

import com.example.bartering.models.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bartering.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<users> listAllUser() {
        return userRepository.findAll();
    }

    public users getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public users saveUser(users usr) {
        return userRepository.save(usr);
    }


}
