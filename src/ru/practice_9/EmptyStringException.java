package ru.practice_9;

public class EmptyStringException extends Exception {
    public EmptyStringException(String errMessage) {
        super(errMessage);
    }
}