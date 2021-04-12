package ru.maksimov.hibernate.example.inheritance_strategy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.maksimov.hibernate.example.inheritance_strategy.model.enum_type.ChannelType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("CA")
@Entity
@Table(name = "credit_card")
public class CreditCard extends BillingDetails{
    private String cardNumber;
}
