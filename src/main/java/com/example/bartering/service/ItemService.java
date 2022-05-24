package com.example.bartering.service;

import com.example.bartering.models.item;
import com.example.bartering.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<item> listAllUser() {
        return itemRepository.findAll();
    }

    public item saveItem(item it) {
        return itemRepository.save(it);
    }

    public List<item> getItemsBySellerid(int id) {
        return itemRepository.findBySellerid(id);
    }


    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }

}
