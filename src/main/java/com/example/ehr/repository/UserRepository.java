package com.example.ehr.repository;

import com.example.ehr.models.users;
import org.springframework.data.jpa.repository.JpaRepository;

//user repository
public interface UserRepository extends JpaRepository<users, Integer>{

    public users findByEmail(String email);

}
