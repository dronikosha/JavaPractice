package ru.practice_9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> studentsList;
    Student reqStudent;

    public LabClass() {
        this.studentsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        studentsList.sort(Student::compareTo);
    }

    public Student search(String studentsName) throws NoStudentException {
        for (Student student : studentsList) {
            if (student.getName().equals(studentsName)) {
                reqStudent = student;
                return reqStudent;
            }
        }
        throw new NoStudentException("Student " + studentsName + " was not found");
    }

    public Student remove() {
        return studentsList.remove(0);
    }

    public boolean isEmpty() {
        return studentsList.isEmpty();
    }
}
