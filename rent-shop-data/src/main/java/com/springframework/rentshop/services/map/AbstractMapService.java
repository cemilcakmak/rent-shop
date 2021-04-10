package com.springframework.rentshop.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    /*
    Map Interface includes methods fo are 3 SET implementations.
    -HashSet, TreeSet and LinkedHashSet.r basic operations such as put, get, remove, containsKey, containsValues, size and empty.
    and bulk operations like putAll anda clear. There
     */

    /*
    HashSet uses HashMap internally and it is the fastest one.
    add, remove, delete performance is O(1), but does not provide order of elements.
    Can contain a null value. Requires less memory.
     */

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        return map.put(id, object);
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
