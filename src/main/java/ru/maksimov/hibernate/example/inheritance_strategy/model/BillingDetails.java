package ru.maksimov.hibernate.example.inheritance_strategy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn()
@Table(name = "billing_details")
public abstract class BillingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_id")
    @SequenceGenerator(name = "bill_id", sequenceName = "bill_id_seq", allocationSize = 1)
    protected Long id;

    protected String owner;
}
