package ru.practice_11.two;

public class Main {
    //TESTING - ArrayQueue
    public static void fill(ArrayQueue stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
    }

    public static void dump(ArrayQueue stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.size() + " " + stack.peek() + " " + stack.pop());
        }
    }

    //TESTING - LinkedQueue
    public static void fill1(LinkedQueue stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
    }

    public static void dump1(LinkedQueue stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.size() + " " + stack.peek() + " " + stack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("TESTING - ArrayQueue with AbstractQueue");
        ArrayQueue stack = new ArrayQueue();
        fill(stack);
        dump(stack);

        System.out.println("TESTING - LinkedQueue with AbstractQueue");
        LinkedQueue stack2 = new LinkedQueue();
        fill1(stack2);
        dump1(stack2);
    }
}
