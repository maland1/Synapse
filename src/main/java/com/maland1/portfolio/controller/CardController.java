package com.maland1.portfolio.controller;

import com.maland1.portfolio.dto.CardDTO;
import com.maland1.portfolio.exception.CardNotFoundException;
import com.maland1.portfolio.service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/card")
public class CardController
{
    private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<CardDTO> getAllCards() {
        return cardService.getAllCards().stream().map(CardDTO::new).toList();
    }

    @GetMapping("/{cardId}")
    public CardDTO getCardById(@PathVariable("cardId") Long id) throws CardNotFoundException {
        return new CardDTO(cardService.getCardById(id));
    }
}
