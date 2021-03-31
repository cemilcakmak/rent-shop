package com.springframework.rentshop.services;

import com.springframework.rentshop.model.Customer;

import java.util.Set;

public interface CustomerService extends CrudService<Customer, Long> {
    Set<Customer> findAll();
}
