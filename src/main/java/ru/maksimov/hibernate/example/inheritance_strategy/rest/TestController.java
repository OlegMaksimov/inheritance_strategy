package ru.maksimov.hibernate.example.inheritance_strategy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BankAccount;
import ru.maksimov.hibernate.example.inheritance_strategy.model.BillingDetails;
import ru.maksimov.hibernate.example.inheritance_strategy.model.OtherDetails;
import ru.maksimov.hibernate.example.inheritance_strategy.service.OperationService;

@RestController
public class TestController {

    @Autowired
    OperationService operationService;

    @GetMapping
    public String test() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwner("trololo");
        bankAccount.setAccount("1234257289472389");
        operationService.execute(bankAccount);
//        OtherDetails entity = new OtherDetails();
//        entity.setOwner("trololo");
//        operationService.execute2(entity);
        return "ok";
    }

    @GetMapping("/get")
    @ResponseBody
    public ResponseEntity<BillingDetails> getEntity(@RequestParam Long id) {
        BillingDetails details = operationService.getEntity(id);
        System.out.println(details);
        return new ResponseEntity<> (details, HttpStatus.OK);
    }
}
