package com.yugioh.project.controller;

import com.yugioh.project.model.Card;
import com.yugioh.project.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CardController {
    @Autowired
    private final CardService service;

    public CardController(CardService service) {
        this.service = service;
    }

    @PostMapping("/card")
    public void post(@RequestBody Card card){
        service.save(card);
    }
    /*@GetMapping("/card")
    public List<Card> getAll(){
        return repository.findAll();
    }*/
    @GetMapping("/card/{id}")
    public Optional<Card> getOne(@PathVariable("id") Long id){
        return service.findById(id);
    }
   /* @DeleteMapping("/card/{id}")
    public void delete(@PathVariable("id") Long id){
        repository.deleteById(id);
    }*/
}
