package com.example.ehr.controllers;

import com.example.ehr.models.negotiations;
import com.example.ehr.service.NegotiationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NegotiationController {
    @Autowired
    NegotiationService negoService;

    @PostMapping("/negotiations")
    public negotiations lissavets(@RequestBody negotiations it) {
        return negoService.saveNego(it);
    }

    @PostMapping("/getnegotiationsbyseller")
    public List<negotiations> getNegoByseller(@RequestBody negotiations it) {
        return negoService.findBySellerId(it.getSellerid());
    }


    @PostMapping("/updatenegotiation")
    public Optional<negotiations> updateNego(@RequestBody negotiations it) {
        Optional<negotiations> nego=  negoService.findById(it.getId());
        nego.ifPresent(negotiations -> negotiations.setStatus(it.getStatus()));
        negoService.saveNego(nego.get());
        return negoService.findById(it.getId());
    }

    @PostMapping("/getnegotiationsbyBuyer")
    public List<negotiations> getNegoByRec(@RequestBody negotiations it) {
        return negoService.findByReceiverId(it.getReceiverid());
    }
}
