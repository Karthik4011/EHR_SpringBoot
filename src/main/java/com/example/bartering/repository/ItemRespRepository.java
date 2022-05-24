package com.example.bartering.repository;

import com.example.bartering.models.item;
import com.example.bartering.models.itemresp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Item repository
public interface ItemRespRepository extends JpaRepository<itemresp, Integer>{

    public List<itemresp> findBySellerid(int sellerid);

}
