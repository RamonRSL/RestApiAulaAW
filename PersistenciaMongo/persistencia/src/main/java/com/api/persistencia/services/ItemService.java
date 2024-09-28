package com.api.persistencia.services;
import com.api.persistencia.models.Item;
import com.api.persistencia.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
    public Optional<Item> findById(String id) {
        return itemRepository.findById(id);
    }
    public Item save(Item item) {
        return itemRepository.save(item);
    }
    public void deleteById(String id) {
        itemRepository.deleteById(id);
    }
}
