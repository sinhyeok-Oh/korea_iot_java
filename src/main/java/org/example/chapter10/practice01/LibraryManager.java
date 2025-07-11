package org.example.chapter10.practice01;

import java.util.ArrayList;
import java.util.List;

// 도서 관리 기능을 수행 (관리할 행동을 실질적 구현)
public class LibraryManager implements  Manageable{
    // 책 저장 공간 (ArrayList - 중복 O, 순서 O / 조회 빠른 기능)
    private List<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void updateStock(String id, int quantity) {

    }

    @Override
    public void listAll() {

    }

    @Override
    public List<Item> search(String keyword) {
        return null;
    }

    @Override
    public List<Item> searchByCategoty(String category) {
        return null;
    }

    @Override
    public List<Item> searchByCategoty() {
        return List.of();
    }
}
