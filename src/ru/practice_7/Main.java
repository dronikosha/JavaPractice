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
            if (((first.peek() == 0) && (second.peek() == 9)) ||
                    first.peek() > second.peek() && ((first.peek() != 9) && (second.peek() != 0))) {
                first.push(first.peek());
                first.push(second.peek());
            }
            else if (first.peek() < second.peek() || ((first.peek() == 9) &&
                    (second.peek() == 0))) {
                second.push(first.peek());
                second.push(second.peek());
            }
            second.pop();
            first.pop();
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
