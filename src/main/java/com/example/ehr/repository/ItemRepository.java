package com.example.ehr.repository;

import com.example.ehr.models.item;
import com.example.ehr.models.itemresp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Item repository
public interface ItemRepository extends JpaRepository<item, Integer>{

    public List<item> findBySellerid(int sellerid);

    @Query(value="select it.id, it.name, it.date, it.desc, it.expectations, it.image, it.producttype, it.quantity, it.sellerid, us.name as sellername from item it, users us where (it.sellerid = us.id)", nativeQuery = true)
    public List<itemresp> getItemsWithseller();

}
