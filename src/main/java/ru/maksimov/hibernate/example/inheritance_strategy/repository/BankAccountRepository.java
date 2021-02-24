package ru.maksimov.hibernate.example.inheritance_strategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BankAccount;

public interface BankAccountRepository extends JpaRepository <BankAccount, Long> {
}
