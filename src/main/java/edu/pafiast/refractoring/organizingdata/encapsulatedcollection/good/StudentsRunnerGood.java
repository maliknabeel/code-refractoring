package edu.pafiast.refractoring.organizingdata.encapsulatedcollection.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentsRunnerGood {
    public static void main(String[] args) {
        // Usage
        Course course = new Course();
        course.addStudent("Alice"); // Controlled modification
        course.addStudent("Bob");
        log.info(course.getStudents().get(1));
    }
}
