package com.example.backend.domain.item.service;

import com.example.backend.domain.item.document.Item;
import java.util.List;

public interface ItemService {

    Item createItem(Item item);

    List<Item> getItemListByName(String name);
}
