package com.yugioh.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int star;
    @Column(nullable = false)
    private int atk;
    @Column(nullable = false)
    private int def;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String description;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStar() {
        return star;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
