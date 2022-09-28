package com.example.ehr.repository;

import com.example.ehr.models.itemresp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Item repository
public interface ItemRespRepository extends JpaRepository<itemresp, Integer>{

    public List<itemresp> findBySellerid(int sellerid);

}
