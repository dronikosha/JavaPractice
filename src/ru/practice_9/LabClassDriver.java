package ru.practice_9;

import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;

    public LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void input() {
        String name;
        int grade;
        System.out.println("Введите имя и оценку студента('0', чтобы закончить ввод): ");
        Scanner in = new Scanner(System.in);
        name = in.next();
        while (!name.equals("0")) {
            grade = in.nextInt();
            labClass.addStudent(new Student(name, grade));
            System.out.println("Введите имя и оценку студента('0', чтобы закончить ввод): ");
            name = in.next();
        }
    }
}
