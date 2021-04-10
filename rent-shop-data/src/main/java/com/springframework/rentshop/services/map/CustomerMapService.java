package com.springframework.rentshop.services.map;

import com.springframework.rentshop.model.Customer;
import com.springframework.rentshop.services.CrudService;

import java.util.Set;

public class CustomerMapService extends AbstractMapService<Customer, Long> implements CrudService<Customer, Long> {

    @Override
    public Set<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Customer save(Customer object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Customer object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
