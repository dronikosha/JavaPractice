package ru.practice_5;

public class Main {
    public static void first_task() {
        System.out.println("1) Треугольная последовательность");
        int k = 0, i, cur = 1;
        int n = 10; // Изменять для задания
        for (i=1; i<n; i++){
            System.out.print(cur + " ");
            k = k + 1;
            if (k == cur) {
                k = 0;
                cur++;
            }
        }
        System.out.println("\n");
    }

    public static void second_task() {
        System.out.println("От 1 до n");
        int n = 10, i; // Изменять для задания
        for (i = 1; i<n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void third_task() {
        int A = 15, B = 12;
        int i;
        if (A<B) {
            for (i = A;i<=B; i++)
                System.out.print(i + " ");
        }
        else {
            for (i = B; i>=A; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        first_task();
        second_task();
        third_task();
    }
}

