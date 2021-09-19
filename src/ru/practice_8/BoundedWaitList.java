package ru.practice_8;

public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity = 5;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public BoundedWaitList() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        content.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}

