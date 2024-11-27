package com.maland1.synapse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter @Setter @Builder @ToString
public class Card
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rarity;
    private String attribute;
    private String[] type;
    private int level;
    private int attack;
    private int defense;
    private String description;
    private String[] tcgReleases;
    private String[] ocgReleases;
}
