package org.example.chapter10.practice01;

//Manage(관리하다) + able(할 수 있는)

import java.util.List;

public interface Manageable {
    // CRUD
    void add(Item item);
    void remove(String id);
    void updateStock(String id, int quantity);
    void listAll();

    // 검색 기능
    List<Item> search(String keyword);
    List<Item> searchByCategoty(String category);
    List<Item> searchByCategoty();
}
