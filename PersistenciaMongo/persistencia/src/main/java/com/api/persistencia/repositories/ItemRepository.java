package com.api.persistencia.repositories;

import com.api.persistencia.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}

