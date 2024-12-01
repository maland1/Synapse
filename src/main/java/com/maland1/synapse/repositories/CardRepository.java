package com.maland1.synapse.repositories;

import com.maland1.synapse.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>
{
    Card findByName(String cardName);

}
