package ru.practice_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();

        Student nikita = new Student(3,"Nikita", "89104268586", 5);
        Student nikolay = new Student(4,"Nikolay", "89164264566", 3);
        Student dmitry = new Student(1,"Dmitry", "89109267312", 2);
        Student vanya = new Student(2,"Vanya", "89194062516", 4);

        stud.add(nikita);
        stud.add(dmitry);
        stud.add(nikolay);
        stud.add(vanya);

        System.out.println("COMPARABLE\n");
        Collections.sort(stud);
        System.out.println(stud);


        System.out.println("\nCOMPARATOR\n");

        List<SortingStudentsByGPA> student = new ArrayList<>();

        SortingStudentsByGPA oleg = new SortingStudentsByGPA(5,"Oleg", "89104268586", 5);
        SortingStudentsByGPA maksim = new SortingStudentsByGPA(7,"Maksim", "89164264566", 3);
        SortingStudentsByGPA nastya = new SortingStudentsByGPA(8,"Nastya", "89109267312", 2);
        SortingStudentsByGPA alisa = new SortingStudentsByGPA(6,"Alisa", "89194062516", 4);

        student.add(oleg);
        student.add(maksim);
        student.add(nastya);
        student.add(alisa);

        Comparator<SortingStudentsByGPA> markComparator = new SortingStudentsByGPA();
        student.sort(markComparator);
        System.out.println(student);

        System.out.println("\nTwo Lists\n" + stud + student);
    }
}
