package edu.pafiast.refractoring.organizingdata.encapsulatedcollection.good;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<String> students = new ArrayList<>();

    // Provide read-only access to the list
    public List<String> getStudents() {
        return new ArrayList<>(students); // Return a copy of the list
    }

    // Provide controlled ways to modify the list
    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }
}
