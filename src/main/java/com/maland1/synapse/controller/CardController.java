package com.maland1.synapse.controller;

import com.maland1.synapse.dto.CardDTO;
import com.maland1.synapse.exception.CardNotFoundException;
import com.maland1.synapse.model.Card;
import com.maland1.synapse.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/card")
public class CardController
{
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }

    @PutMapping("/{cardId}")
    public Card updateCard(@PathVariable("cardId") Long id, @RequestBody Card card) throws CardNotFoundException{
        return cardService.updateCard(id, card);
    }

    // Look into "builder" object pattern?
    @GetMapping("/search")
    public List<CardDTO> getCardsByFilters(@RequestParam(value = "name", required = false) String name,
                                           @RequestParam(value = "rarity", required = false) String rarity,
                                           @RequestParam(value = "attribute", required = false) String attribute,
                                           @RequestParam(value = "type", required = false) String[] type,
                                           @RequestParam(value = "level", required = false) Integer level,
                                           @RequestParam(value = "attack", required = false) Integer attack,
                                           @RequestParam(value = "defense", required = false) Integer defense,
                                           @RequestParam(value = "tcgReleases", required = false) String[] tcgReleases,
                                           @RequestParam(value = "ocgReleases", required = false) String[] ocgReleases) throws CardNotFoundException {
        return cardService.getCardsByFilters(name, rarity, attribute, type, level, attack, defense, tcgReleases, ocgReleases).stream().map(CardDTO::new).toList();
    }

    @GetMapping
    public List<CardDTO> getAllCards() {
        return cardService.getAllCards().stream().map(CardDTO::new).toList();
    }
}
