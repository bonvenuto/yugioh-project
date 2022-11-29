package com.yugioh.project.service;

import com.yugioh.project.model.Card;
import com.yugioh.project.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{
    private final CardRepository repository;

    public CardServiceImpl(CardRepository repository) {
        this.repository = repository;
    }

    @Override
    public Card save(Card card) {
        return repository.save(card);
    }

    @Override
    public Optional<Card> findById(Long id) {
        return repository.findById(id);
    }
}
