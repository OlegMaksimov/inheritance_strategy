package ru.maksimov.hibernate.example.inheritance_strategy.service;

import org.springframework.stereotype.Service;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BankAccount;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BillingDetails;
import ru.maksimov.hibernate.example.inheritance_strategy.model.OtherDetails;
import ru.maksimov.hibernate.example.inheritance_strategy.model.enum_type.ChannelType;
import ru.maksimov.hibernate.example.inheritance_strategy.repository.BankAccountRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.repository.BillingDetailRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.repository.CreditCardRepository;
import ru.maksimov.hibernate.example.inheritance_strategy.repository.OtherDetailsRepository;

@Service
public class OperationService {

    private final BankAccountRepository bankAccountRepository;
    private final CreditCardRepository creditCardRepository;
    private final OtherDetailsRepository otherDetailsRepository;
    private final BillingDetailRepository billingDetailRepository;

    public OperationService(BankAccountRepository bankAccountRepository, CreditCardRepository creditCardRepository, OtherDetailsRepository otherDetailsRepository, BillingDetailRepository billingDetailRepository) {
        this.bankAccountRepository = bankAccountRepository;
        this.creditCardRepository = creditCardRepository;
        this.otherDetailsRepository = otherDetailsRepository;
        this.billingDetailRepository = billingDetailRepository;
    }

    public void execute(BillingDetails details) {
        BankAccount bankAccount = (BankAccount) details;
        bankAccountRepository.save(bankAccount);

    }
    public void execute2(BillingDetails details) {
        OtherDetails entity = (OtherDetails) details;
        otherDetailsRepository.save(entity);
    }


    public BillingDetails getEntity(Long id) {
        return billingDetailRepository.findById(id).orElse(null);
    }

}
