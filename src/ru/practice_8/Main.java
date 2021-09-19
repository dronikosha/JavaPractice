package ru.practice_8;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList boundedWaitList = new BoundedWaitList();
        for (int i = 0; i<5; i++) {
            boundedWaitList.add(i);
        }
        System.out.println(boundedWaitList.content);

        UnfairWaitList unfairWaitList = new UnfairWaitList();
        for (int i = 0; i<10; i++) {
            unfairWaitList.add(i);
        }
        System.out.println(unfairWaitList.content);

        WaitList waitList;
        waitList = unfairWaitList;
        System.out.println("\n\n" + waitList.content);
        System.out.println("Empty: " + waitList.isEmpty());
        System.out.println("Contains 4: " + waitList.contains(4));
        System.out.println("Removed number: " + waitList.remove());
        System.out.println(waitList.content);
    }
}
