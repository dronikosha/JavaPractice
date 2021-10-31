package ru.practice_16.exceptions;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Заказ уже существует");
    }
}
