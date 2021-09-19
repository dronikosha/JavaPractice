package ru.practice_9;

public record Student(String name, int grade) implements Comparable<Student> {
    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getGrade(), o.getGrade());
    }
}
