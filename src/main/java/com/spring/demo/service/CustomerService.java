package com.spring.demo.service;

import com.spring.demo.module.Customers;
import com.spring.demo.repositery.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customers saveCustomer(Customers customers) {
        return customerRepository.save(customers);
    }

}
