package com.spring.demo.repositery;

import com.spring.demo.module.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers,Integer> {
}