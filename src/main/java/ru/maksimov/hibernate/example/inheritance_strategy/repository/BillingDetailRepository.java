package ru.maksimov.hibernate.example.inheritance_strategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BankAccount;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BillingDetails;

public interface BillingDetailRepository extends JpaRepository <BillingDetails, Long> {

}
