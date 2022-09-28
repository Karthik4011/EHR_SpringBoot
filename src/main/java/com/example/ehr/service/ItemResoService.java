package com.example.ehr.service;

import com.example.ehr.models.itemresp;
import com.example.ehr.repository.ItemRespRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemResoService {
    @Autowired
    private ItemRespRepository itemRepRepository;

    public List<itemresp> listAllUser() {
        return itemRepRepository.findAll();
    }

    public itemresp saveItems(itemresp it) {
        return itemRepRepository.save(it);
    }

    public List<itemresp> getItemsBySellerid(int id) {
        return itemRepRepository.findBySellerid(id);
    }


    public void deleteItem(int id) {
        itemRepRepository.deleteById(id);
    }

}
