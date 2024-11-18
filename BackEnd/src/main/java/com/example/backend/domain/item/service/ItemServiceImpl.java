package com.example.backend.domain.item.service;

import com.example.backend.domain.item.document.Item;
import com.example.backend.domain.item.repository.ItemRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;


    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getItemListByName(String name) {
        return itemRepository.findByName(name);
    }
}
