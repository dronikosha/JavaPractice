package ru.practice_9;

import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        driver.input();
    }

    public void searchForStudent() {
        String name = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя студента, которого хотите найти:");
        try {
            name = in.next();
            if (name.isBlank())
                throw new EmptyStringException("Empty string!");
        } catch (EmptyStringException e) {
            System.err.println(e.getMessage());
            System.out.println();
            searchForStudent();
        }
        try {
            System.out.println(labClass.search(name).toString());
        } catch (NoStudentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LabClassUI start = new LabClassUI();
        start.searchForStudent();
    }
}
