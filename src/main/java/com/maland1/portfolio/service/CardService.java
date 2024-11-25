package com.maland1.portfolio.service;

import com.maland1.portfolio.exception.CardNotFoundException;
import com.maland1.portfolio.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService
{
    List<Card> getAllCards();

    Card getCardById(Long id) throws CardNotFoundException;

    Card getCardByName(String cardName) throws CardNotFoundException;

    Card saveCard(Card card);
}