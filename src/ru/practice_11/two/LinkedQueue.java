package ru.practice_11.two;

public class LinkedQueue extends AbstractQueue {
    private Node head;

    public void push(Object element) {
        size++;
        head = new Node(element, head);
    }

    @Override
    public Object pop() {
        size--;
        Object result = head.value;
        head = head.next;
        return result;
    }

    @Override
    public Object peek() {
        return head.value;
    }

    private record Node(Object value, LinkedQueue.Node next) {
    }

}