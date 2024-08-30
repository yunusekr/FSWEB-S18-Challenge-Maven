package com.workintech.fswebs18challengemaven.controller;

import com.workintech.fswebs18challengemaven.entity.Card;
import com.workintech.fswebs18challengemaven.entity.Color;
import com.workintech.fswebs18challengemaven.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/cards")
    public List<Card> getCards(){
        return cardRepository.findAll();
    }

    @PostMapping("/cards")
    public Card postCard(@RequestBody Card card){
        return cardRepository.save(card);
    }

    @DeleteMapping("/cards/{id}")
    public Card deleteCard(@PathVariable long id){
        return cardRepository.remove(id);
    }

    @PutMapping("/cards/")
    public Card updateCard(@RequestBody Card card){
        return cardRepository.update(card);
    }

    @GetMapping("/cards/byColor/{color}")
    public List<Card> getByColor(@PathVariable String color){
        return cardRepository.findByColor(color);
    }

    @GetMapping("/cards/byType/{type}")
    public List<Card> getByType(@PathVariable String type){
        return cardRepository.findByType(type);
    }

    @GetMapping("/cards/byValue/{value}")
    public List<Card> getByValue(@PathVariable Integer value){
        return cardRepository.findByValue(value);
    }
}