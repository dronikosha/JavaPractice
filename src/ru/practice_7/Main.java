package ru.practice_7;

import java.util.Stack;

public class Main {

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static String game(Stack<Integer> first, Stack<Integer> second) {
        int count = 0;
        for (int i = 0; i < 106; i++) {
            count++;
            if (((first.get(0) == 0) && (second.get(0) == 9)) ||
                    first.get(0) > second.get(0) && ((first.get(0) != 9) && (second.get(0) != 0))) {
                first.add(first.get(0));
                first.add(second.get(0));
            }
            else if (first.get(0) < second.get(0) || ((first.get(0) == 9) &&
                    (second.get(0) == 0))) {
                second.add(first.get(0));
                second.add(second.get(0));
            }
            second.remove(0);
            first.remove(0);
            if (second.empty()) {
                return "first " + count;
            }
            else if (first.empty()) {
                return "second " + count;
            }
        }
        return "botva";
    }

    public static void main(String[] args) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < 5; i++) {
            first.add(rnd(0, 9));
            second.add(rnd(0, 9));
        }
        System.out.println(" Первый игрок                     Второй игрок");
        System.out.println(first + "                  " + second);
        System.out.println("Результат: " + game(first, second));
    }
}
