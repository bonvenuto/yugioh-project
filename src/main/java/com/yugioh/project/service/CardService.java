package com.yugioh.project.service;

import com.yugioh.project.model.Card;

import java.util.Optional;


public interface CardService{

Card save(Card card);
Optional<Card> findById(Long id);


}
