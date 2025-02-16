package edu.pafiast.refractoring.organizingdata.encapsulatedcollection.bad;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<String> students = new ArrayList<>();

    public List<String> getStudents() {
        return students; // Exposes the internal list
    }
}