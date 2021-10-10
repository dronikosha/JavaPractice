package ru.practice_11.one;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[5];

    public void push(ArrayQueue this, Object element) {
        this.ensureCapacity(size + 1);
        this.elements[this.size++] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, 2 * capacity);
        }
    }

    public Object peek() {
        return elements[size - 1];
    }

    public Object pop() {
        Object value = peek();
        elements[--size] = 0;
        return value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}