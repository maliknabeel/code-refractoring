package edu.pafiast.refractoring.organizingdata.encapsulatedcollection.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentsRunnerBad {
    public static void main(String[] args) {
        // Usage
        Course course = new Course();
        course.getStudents().add("Alice"); // External code can directly modify the list
        course.getStudents().add("Bob");
        log.info(course.getStudents().get(1));
    }
}
