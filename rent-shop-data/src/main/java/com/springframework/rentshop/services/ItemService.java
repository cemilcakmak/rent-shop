package com.springframework.rentshop.services;

import com.springframework.rentshop.model.Item;

import java.util.Set;

public interface ItemService {
    Item findById(Long id);

    Item save(Item customer);

    Set<Item> findAll();
}
