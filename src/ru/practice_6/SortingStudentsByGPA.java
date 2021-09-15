package ru.practice_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA> {

    private String name;
    private String phone;
    private int mark;
    private int ID;

    public SortingStudentsByGPA(int ID,String name, String phone, int mark) {
        this.name = name;
        this.phone = phone;
        this.mark = mark;
        this.ID = ID;
    }

    public SortingStudentsByGPA() {

    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", mark=" + mark +
                ", ID=" + ID +
                "}\n";
    }

    @Override
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        return o2.getMark() - o1.getMark();
    }

}