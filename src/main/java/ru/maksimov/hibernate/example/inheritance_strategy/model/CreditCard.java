package ru.maksimov.hibernate.example.inheritance_strategy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit_card")
public class CreditCard extends BillingDetails{
    private String cardNumber;
}
