package ru.practice_9;

public class NoStudentException extends Exception {
    public NoStudentException(String errMessage) {
        super(errMessage);
    }
}