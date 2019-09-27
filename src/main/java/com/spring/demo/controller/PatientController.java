package com.spring.demo.controller;

import com.spring.demo.module.Customers;
import com.spring.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public Customers create(@RequestParam Map<String, String> body){
        String first_name = body.get("first_name");
        String last_name = body.get("last_name");
        String email = body.get("email");
        return customerService.saveCustomer(new Customers(email,first_name,last_name));
    }
    }

