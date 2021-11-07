package ru.practice_19_to_20;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CarNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        Arrays.sort(letter);

        ArrayList<String> arrayList = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();


        //буквы
        int n = 120;

        for (String letters : letter) {
            for (int region = 1; region <= 199; region++) {
                for (int j = 1; j <= n; j++) {
                    extracted(arrayList, hashSet, treeSet, j, letters, letters, letters, region);
                }
            }
        }

        //цифры
        for (int i = 111; i <= 999; i += 111) {
            for (String a1 : letter) {
                for (String a2 : letter) {
                    for (String a3 : letter) {
                        for (int region = 1; region <= 199; region++) {
                            extracted(arrayList, hashSet, treeSet, i, a1, a2, a3, region);
                        }
                    }
                }
            }
        }

        System.out.println(arrayList);

        System.out.print("Номер для поиска:  ");
        String search = in.next();

        searching(arrayList, hashSet, treeSet, search);
    }

    private static void searching(@NotNull ArrayList<String> arrayList, HashSet<String> hashSet, TreeSet<String> treeSet, String search) {
        long m = System.nanoTime();
        if (arrayList.contains(search)) {
            System.out.println("Поиск перебором: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m) + "нс");
        } else System.out.println("Поиск перебором: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m) + "нс");

        Collections.sort(arrayList);
        long m1 = System.nanoTime();
        boolean result = arrayList.contains(search);
        if (result) {
            System.out.println("Бинарный поиск: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m1) + "нс");
        } else System.out.println("Бинарный поиск: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m1) + "нс");

        long m2 = System.nanoTime();
        if (hashSet.contains(search)) {
            System.out.println("Поиск в HashSet: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m2) + "нс");
        } else System.out.println("Поиск в HashSet: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m2) + "нс");

        long m3 = System.nanoTime();
        if (treeSet.contains(search)) {
            System.out.println("Поиск в TreeSet: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m3) + "нс");
        } else System.out.println("Поиск в TreeSet: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m3) + "нс");
    }

    private static void extracted(@NotNull ArrayList<String> arrayList, @NotNull HashSet<String> hashSet, @NotNull TreeSet<String> treeSet, int i, String l1, String l2, String l3, int region) {
        String format = String.format("%s%03d%s%s%02d", l1, i, l2, l3, region);
        arrayList.add(format);
        hashSet.add(format);
        treeSet.add(format);

    }
}
