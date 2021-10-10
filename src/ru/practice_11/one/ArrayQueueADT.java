package ru.practice_11.one;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[10];

    public static void push(ArrayQueueADT stack, Object element) {
        ensureCapacity(stack, stack.size + 1);
        stack.elements[stack.size++] = element;
    }

    private static void ensureCapacity(ArrayQueueADT stack, int capacity) {
        if (capacity > stack.elements.length) {
            stack.elements = Arrays.copyOf(stack.elements, 2 * capacity);
        }
    }

    public static Object pop(ArrayQueueADT stack) {
        return stack.elements[--stack.size];
    }

    public static Object peek(ArrayQueueADT stack) {
        return stack.elements[stack.size - 1];
    }
    public static int size(ArrayQueueADT stack) {
        return stack.size;
    }

    public static boolean isEmpty(ArrayQueueADT stack) {
        return stack.size == 0;
    }

}