package com.maland1.synapse.dto;

import com.maland1.synapse.model.Card;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardDTO
{
    private Long id;
    private String name;
    private String rarity;
    private String attribute;
    private String[] type;
    private int attack;
    private int defense;
    private int level;
    private String description;
    private String[] tcgReleases;
    private String[] ocgReleases;

    public CardDTO(Card card) {
        this.id = getId();
        this.name = getName();
        this.rarity = getRarity();
        this.attribute = getAttribute();
        this.type = getType();
        this.level = getLevel();
        this.attack = getAttack();
        this.defense = getDefense();
        this.description = getDescription();
        this.tcgReleases = getTcgReleases();
        this.ocgReleases = getOcgReleases();
    }

    public Card asCard() {
        return Card.builder()
            .id(this.id)
            .name(this.name)
            .rarity(this.rarity)
            .attribute(this.attribute)
            .type(this.type)
            .level(this.level)
            .attack(this.attack)
            .defense(this.defense)
            .description(this.description)
            .tcgReleases(this.tcgReleases)
            .ocgReleases(this.ocgReleases)
            .build();
    }
}
