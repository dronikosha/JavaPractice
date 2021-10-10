package ru.practice_11.one;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];

    public static void push(Object element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public static Object pop() {
        return elements[--size];
    }

    public static Object peek() { //n
        return elements[size - 1];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

}