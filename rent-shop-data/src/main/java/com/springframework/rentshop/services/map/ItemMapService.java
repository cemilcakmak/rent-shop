package com.springframework.rentshop.services.map;

import com.springframework.rentshop.model.Employee;
import com.springframework.rentshop.model.Item;
import com.springframework.rentshop.services.CrudService;

import java.util.Set;

public class ItemMapService extends AbstractMapService<Item, Long> implements CrudService<Item, Long> {

    @Override
    public Set<Item> findAll() {
        return super.findAll();
    }

    @Override
    public Item findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Item save(Item object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Item object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
