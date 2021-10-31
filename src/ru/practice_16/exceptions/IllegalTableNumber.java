package ru.practice_16.exceptions;

public class IllegalTableNumber extends Exception {
    public IllegalTableNumber() {
        super("Такого стола нет");
    }
}
