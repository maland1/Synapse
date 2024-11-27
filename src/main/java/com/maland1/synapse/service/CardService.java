package com.maland1.synapse.service;

import com.maland1.synapse.exception.CardNotFoundException;
import com.maland1.synapse.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService
{
    Card createCard(Card card);

    Card updateCard(Long id, Card card) throws CardNotFoundException;

    List<Card> getCardsByFilters(String name, String rarity, String attribute, String[] type, Integer level, Integer attack, Integer defense, String[] tcgReleases, String[] ocgReleases) throws CardNotFoundException;

    List<Card> getAllCards();
}