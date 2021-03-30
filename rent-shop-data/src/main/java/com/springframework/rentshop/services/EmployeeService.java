package com.springframework.rentshop.services;

import com.springframework.rentshop.model.Employee;

import java.util.Set;

public interface EmployeeService {
    Employee findById(Long id);

    Employee save(Employee customer);

    Set<Employee> findAll();
}
