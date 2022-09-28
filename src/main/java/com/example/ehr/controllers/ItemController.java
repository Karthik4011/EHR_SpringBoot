package com.example.ehr.controllers;

import com.example.ehr.models.item;
import com.example.ehr.models.itemresp;
import com.example.ehr.service.ItemResoService;
import com.example.ehr.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {
    @Autowired
    ItemService itemService;

    @Autowired
    ItemResoService itemresService;

    @GetMapping("/items")
    public List<item> list() {
        return itemService.listAllUser();
    }


    @PostMapping("/item")
    public itemresp lissavets(@RequestBody itemresp it) {
        return itemresService.saveItems(it);
    }

    @PostMapping("/items")
    public item lissave(@RequestBody item it) {
        return itemService.saveItem(it);
    }

    @GetMapping("/items/{userid}")
    public List<item> listbyuserid(@PathVariable int userid) {
        return itemService.getItemsBySellerid(userid);
    }

    @DeleteMapping("/items/{itemid}")
    public void deleteItem(@PathVariable int itemid){
        itemService.deleteItem(itemid);
    }

}
