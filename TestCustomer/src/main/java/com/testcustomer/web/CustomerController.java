package com.testcustomer.web;

import com.testcustomer.domain.Customer;
import com.testcustomer.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/customers")
    public Iterable<Customer> getCars() {
        return repository.findAll();
    }
}
