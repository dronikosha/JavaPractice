package ru.practice_16.lists;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class OrderList<T> {
    private Node<T> front;
    private int size;

    public OrderList() {
        front = null;
        size = 0;
    }

    public void add(T x) {
        if (isEmpty())
            front = new Node<T>(x);
        else {
            Node<T> temp = front;
            front = new Node<T>(null, x, temp);
            front.next.prev = front;
        }
        size++;
    }

    public void remove(T x) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        if (front.data.equals(x)) {
            front = front.next;
            return;
        }

        Node<T> current = front;

        while (current != null && !current.data.equals(x))
            current = current.next;

        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node getNext(@NotNull Node current){
        return current.next;
    }

    public Node getFront(){
        return front;
    }



    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this(null, data, null);
        }

        Node(Node<T> prev, T data, Node<T> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public T getData(){
            return data;
        }
    }
}
