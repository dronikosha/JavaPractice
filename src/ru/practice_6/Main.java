package ru.practice_6;

import java.util.*;

public class Main {

    static Student[] merge(Student[] arr1, Student[] arr2) {
        Set<Student> set = new HashSet<>();
        set.addAll(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(new Student[]{});
    }

    public static void InsertionSort(Student[] iDNumber) {
        for (int left = 0; left < iDNumber.length; left++) {
            Student value = iDNumber[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getMark() < iDNumber[i].getMark()) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
    }

    public static void main(String[] args) {


        Student nikita = new Student(3,"Nikita", "89104268586", 5);
        Student nikolay = new Student(4,"Nikolay", "89164264566", 3);
        Student dmitry = new Student(1,"Dmitry", "89109267312", 2);
        Student vanya = new Student(2,"Vanya", "89194062516", 4);

        Student[] iDNumeber = new Student[] {nikita, nikolay, dmitry, vanya};
        InsertionSort(iDNumeber);
        System.out.println(Arrays.toString(iDNumeber));

        System.out.println("\nCOMPARATOR\n");
        Student oleg = new Student(6,"Oleg", "89104268586", 2);
        Student maksim = new Student(8,"Maksim", "89164264566", 4);
        Student nastya = new Student(7,"Nastya", "89109267312", 5);
        Student alisa = new Student(5,"Alisa", "89194062516", 3);
        Student[] comparator_sort = new Student[] {oleg, maksim, nastya, alisa};
        Arrays.sort(comparator_sort, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(comparator_sort));

        System.out.println("\nBOTH MASSIVE\n");
        Student[] merge_arrays = merge(iDNumeber, comparator_sort);
        InsertionSort(merge_arrays);
        System.out.println(Arrays.toString(merge_arrays));


    }
}
