package ru.practice_16.models;


import ru.practice_16.exceptions.IllegalTableNumber;
import ru.practice_16.items.Item;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private final Order[] restaurantOrders = new Order[20];
    private final Map<String, Order> internetOrders = new HashMap<>();


    public void add(int tableNumber, Order order) {
        restaurantOrders[tableNumber] = order;
    }

    public void add(String address, Order order) {
        internetOrders.put(address, order);
    }

    public Order getOrders(int tableNumber) {
        return restaurantOrders[tableNumber];
    }

    public Order getOrders(String address) {
        return internetOrders.get(address);
    }

    public void addItem(Item item, int tableNumber) throws IllegalTableNumber {
        if (tableNumber < 0 || tableNumber  >= restaurantOrders.length) throw new IllegalTableNumber();
        restaurantOrders[tableNumber].add(item);
    }

    public void addItem(Item item, String address){
        internetOrders.get(address).add(item);
    }

    public void removeOrder(int tableNumber) {
        restaurantOrders[tableNumber] = null;
    }

    public void removeOrder(String address) {
        internetOrders.remove(address);
    }

    public int freeTableNumber(){
        for (int i = 0; i < 20;i++){
            if (restaurantOrders[i] == null)
                return i;
        }
        return -1;
    }

    public int[] freeTableNumbers(){
        int[] a = new int[20];
        int j = 0;
        for (int i = 0; i < 20;i++)
            if (restaurantOrders[i] == null) {
                a[j] = i;
                j++;
            }
        return a;
    }

    public Order[] getRestaurantOrders() {
        return restaurantOrders;
    }

    public Order[] getInternetOrders() {
        return internetOrders.values().toArray(new Order[0]);
    }

    public double restaurantCostSummary() {
        int count = 0;
        for (int i = 0; i < 20; i++)
            if (restaurantOrders[i] != null) count += restaurantOrders[i].costTotal();
        return count;
    }

    public double internetCostSummary() {
        int count = 0;
        for(Order i: internetOrders.values())
            count += i.costTotal();
        return count;
    }

    public int itemRestaurantQuantity(String itemName){
        int count = 0 ;
        for (int i = 0; i < 20; i++)
            if (restaurantOrders[i] != null) {
                count += restaurantOrders[i].itemQuantity(itemName);
            }
        return count;
    }

    public int itemInternetQuantity(String itemName){
        int count = 0;
        for (Order i : internetOrders.values())
            count += i.itemQuantity(itemName);
        return count;
    }
}