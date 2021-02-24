package ru.maksimov.hibernate.example.inheritance_strategy.repository;

import org.springframework.data.repository.CrudRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.model.OtherDetails;

public interface OtherDetailsRepository extends CrudRepository<OtherDetails, Long> {
}
