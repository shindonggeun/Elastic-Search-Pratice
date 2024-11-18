package com.example.backend.domain.item.repository;

import com.example.backend.domain.item.document.Item;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemRepository extends ElasticsearchRepository<Item, String> {

    List<Item> findByName(String name);
}
