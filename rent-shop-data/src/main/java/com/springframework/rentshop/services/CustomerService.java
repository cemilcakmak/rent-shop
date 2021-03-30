package com.springframework.rentshop.services;

import com.springframework.rentshop.model.Customer;

import java.util.Set;

public interface CustomerService {
    Customer findByLastName(String lastName);

    Customer findById(Long id);

    Customer save(Customer customer);

    Set<Customer> findAll();
}
