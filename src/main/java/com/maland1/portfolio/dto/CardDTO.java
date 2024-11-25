package com.maland1.portfolio.dto;

import com.maland1.portfolio.model.Card;
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
        this.attack = getAttack();
        this.defense = getDefense();
        this.level = getLevel();
        this.description = getDescription();
        this.tcgReleases = getTcgReleases();
        this.ocgReleases = getOcgReleases();
    }

    public Card asCard() {
        Card card = new Card();
        card.setId(this.id);
        card.setName(this.name);
        card.setRarity(this.rarity);
        card.setAttribute(this.attribute);
        card.setType(this.type);
        card.setAttack(this.attack);
        card.setDefense(this.defense);
        card.setLevel(this.level);
        card.setDescription(this.description);
        card.setTcgReleases(this.tcgReleases);
        card.setOcgReleases(this.ocgReleases);
        return card;
    }
}
