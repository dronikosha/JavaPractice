package ru.practice_17_to_18;


import java.util.regex.Pattern;

public class first_task {
    public static void main(String[] args) {
        String regexp = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnopq12314stuv18340";
        System.out.println("С помощью matcher проверим строку: " + test2);
        System.out.println(test2.matches(regexp));
        System.out.println("\"С помощью pattern проверим строку: " + test2 + "\n, а потом строку " + regexp);
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        System.out.println((pattern.matcher(test2).find()));
        System.out.println(pattern.matcher(regexp).find());


    }
}
