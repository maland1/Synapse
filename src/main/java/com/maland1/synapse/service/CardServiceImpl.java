package com.maland1.synapse.service;

import com.maland1.synapse.exception.CardNotFoundException;
import com.maland1.synapse.model.Card;
import com.maland1.synapse.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService
{
    private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card updateCard(Long id, Card updatedCard) throws CardNotFoundException {
        Optional<Card> existingCardOptional = cardRepository.findById(id);
        if (existingCardOptional.isPresent()) {
            Card existingCard = existingCardOptional.get();
            existingCard.setName(updatedCard.getName());
            existingCard.setRarity(updatedCard.getRarity());
            existingCard.setAttribute(updatedCard.getAttribute());
            existingCard.setType(updatedCard.getType());
            existingCard.setLevel(updatedCard.getLevel());
            existingCard.setAttack(updatedCard.getAttack());
            existingCard.setDefense(updatedCard.getDefense());
            existingCard.setDescription(updatedCard.getDescription());
            existingCard.setTcgReleases(updatedCard.getTcgReleases());
            existingCard.setOcgReleases(updatedCard.getOcgReleases());
            return cardRepository.save(existingCard);
        } else {
            throw new CardNotFoundException("No card found with id: " + id);
        }
    }

    @Override
    public List<Card> getCardsByFilters(String name, String rarity, String attribute, String[] type, Integer level, Integer attack, Integer defense, String[] tcgReleases, String[] ocgReleases) throws CardNotFoundException {
        return List.of();
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }
}
