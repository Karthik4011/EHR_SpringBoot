package com.example.bartering.repository;

import com.example.bartering.models.users;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface UserRepository extends JpaRepository<users, Integer>{

    public users findByEmail(String email);

    public users findByName(String name);

}
