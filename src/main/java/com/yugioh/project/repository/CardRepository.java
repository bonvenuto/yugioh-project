package com.yugioh.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yugioh.project.model.Card;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
