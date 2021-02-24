package ru.maksimov.hibernate.example.inheritance_strategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
