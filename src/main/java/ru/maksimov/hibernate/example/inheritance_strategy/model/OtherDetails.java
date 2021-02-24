package ru.maksimov.hibernate.example.inheritance_strategy.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("OD")
@Entity
@Table(name = "other_details")
public class OtherDetails extends BillingDetails{
}
