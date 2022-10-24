package com.example.ehr.repository;

import com.example.ehr.models.documents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//user repository
public interface DocumentsRepository extends JpaRepository<documents, Integer>{

    public List<documents> findByUserid(int userid);


}
