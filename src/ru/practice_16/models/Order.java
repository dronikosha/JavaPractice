package ru.practice_16.models;


import ru.practice_16.items.Item;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int itemQuantity();
    double costTotal();
    Item[] getItems();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortedItemsByCostDesc();
}
