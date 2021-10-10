package ru.practice_11.one;

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

    //TESTING - ArrayQueueADT
    public static void fill2(ArrayQueueADT stack) {
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.push(stack, i);
        }
    }

    public static void dump2(ArrayQueueADT stack) {
        while (!ArrayQueueADT.isEmpty(stack)) {
            System.out.println(ArrayQueueADT.size(stack) + " " +
                    ArrayQueueADT.peek(stack) + " " + ArrayQueueADT.pop(stack));
        }
    }

    //TESTING - ArrayQueueModule
    public static void fill3() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.push(i);
        }
    }

    public static void dump3() {
        while (!ArrayQueueModule.isEmpty()) {
            System.out.println(ArrayQueueModule.size() + " "
                    + ArrayQueueModule.peek() + " " + ArrayQueueModule.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("TESTING - ArrayQueue");
        ArrayQueue stack = new ArrayQueue();
        fill(stack);
        dump(stack);

        System.out.println("TESTING - ArrayQueueADT");
        ArrayQueueADT stack2 = new ArrayQueueADT();
        fill2(stack2);
        dump2(stack2);

        System.out.println("TESTING - ArrayQueueModule");
        fill3();
        dump3();
    }
}
