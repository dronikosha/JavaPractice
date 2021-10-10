package ru.practice_12.one;

public class person {
    private String first_name;
    private final String second_name;
    private String patronymic;

    person(String surname) {
        this.second_name = surname;
    }

    person(String surname, String name, String patronymic) {
        this.second_name = surname;
        this.first_name = name;
        this.patronymic = patronymic;
    }

    public String toString() {
        if (first_name == null || patronymic == null) {
            return (second_name);
        } else {
            return (second_name + " " + first_name + " " + patronymic);
        }
    }

    public static void main(String[] args) {
        person first_person = new person("Деревянкин", "Никита", "Алексеевич");
        System.out.println(first_person);
        person second_person = new person("Деревянкин");
        System.out.println(second_person);
    }
}
