package ru.practice_11.two;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
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

    @Override
    public Object peek() {
        return elements[size - 1];
    }

    @Override
    public Object pop() {
        Object value = peek();
        elements[--size] = 0;
        return value;
    }
}