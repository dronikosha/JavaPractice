package ru.practice_12.two;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, block, flat;

    public Address() {
    }

    public void AddAddress(String data, int i) {
        if (i == 0) {
            country = data;
        }
        if (i == 1) {
            region = data;
        }
        if (i == 2) {
            city = data;
        }
        if (i == 3) {
            street = data;
        }
        if (i == 4) {
            house = data;
        }
        if (i == 5) {
            block = data;
        }
        if (i == 6) {
            flat = data;
        }
    }

    public String toString() {
        return ("Полный адрес: " + country + " " + region + " " + city + " " + street + " " + house + " " + block + " " + flat);
    }

    public static void main(String[] args) {
        int i = 0, j = 0;
        Address address = new Address();
        System.out.println("Первое задание:");
        String str1 = "Россия,97,Долгопрудный,Лихачи,7,12/2,45";
        System.out.println(str1 = str1.replaceAll(" ", ""));
        for (String data : str1.split(",")) {
            address.AddAddress(data, i);
            i++;
        }
        System.out.println(address + "\n\n");


        System.out.println("Второе задание:");
        String str2 = "Россия,97,Долгопрудный:Лихачи; 52,12/2.45";
        System.out.println(str2 = str2.replaceAll(" ", ""));
        StringTokenizer st = new StringTokenizer(str2, ",.;-");
        while (st.hasMoreTokens()) {
            address.AddAddress(st.nextToken(), j);
            j++;
        }
        System.out.println(address);

    }
}