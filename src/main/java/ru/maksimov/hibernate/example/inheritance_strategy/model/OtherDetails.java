package ru.maksimov.hibernate.example.inheritance_strategy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "other_details")
public class OtherDetails extends BillingDetails{
}
