package ru.maksimov.hibernate.example.inheritance_strategy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.maksimov.hibernate.example.inheritance_strategy.model.enum_type.ChannelType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import static ru.maksimov.hibernate.example.inheritance_strategy.model.enum_type.ChannelType.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("BA")
@Entity
@Table(name = "bank_account")
public class BankAccount extends BillingDetails{
    private String account;
}
