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

        System.out.println("\nCOMPARABLE\n");
        Collections.sort(stud);
        System.out.println(stud);


        System.out.println("\nCOMPARATOR\n");

        List<Student> student = new ArrayList<>();

        Student oleg = new Student(6,"Oleg", "89104268586", 5);
        Student maksim = new Student(8,"Maksim", "89164264566", 3);
        Student nastya = new Student(7,"Nastya", "89109267312", 2);
        Student alisa = new Student(5,"Alisa", "89194062516", 4);

        student.add(oleg);
        student.add(maksim);
        student.add(nastya);
        student.add(alisa);

        Comparator markComparator = new SortingStudentsByGPA();
        student.sort(markComparator);
        System.out.println(student);

        List<Student> twoLists = new ArrayList<>();
        twoLists.addAll(stud);
        twoLists.addAll(student);

        twoLists.sort(markComparator);
        System.out.println("\n\nTWO SORTED LISTS\n\n" + twoLists);
    }
}
