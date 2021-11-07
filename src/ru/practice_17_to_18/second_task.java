package ru.practice_17_to_18;

import java.util.regex.Pattern;

public class second_task {
    public static void main(String[] args) {
        String test = "aE:dC:cA:56:76:54";

        Pattern pattern = Pattern.compile("^([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})$");
        if ((pattern.matcher(test)).find()) {
            System.out.println("Является");
        } else
            System.out.println("Не является");

    }
}
