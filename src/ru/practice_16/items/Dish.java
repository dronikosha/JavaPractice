package ru.practice_16.items;

import org.jetbrains.annotations.NotNull;

public class Dish implements Item {
    private final int price;
    private final String name;
    private final String description;

    public Dish(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Dish(@NotNull String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Блюдо " + name + " стоит $" + getPrice() + ". Описание: " + description;
    }
}
