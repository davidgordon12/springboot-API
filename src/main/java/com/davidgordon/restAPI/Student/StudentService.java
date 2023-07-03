package com.davidgordon.restAPI.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student (
                1,
                "David",
                "Gordon",
                LocalDate.of(2002, 12, 13),
                4.0f
        ));

        students.add(new Student (
                2,
                "Jane",
                "Doe",
                LocalDate.of(2001, 01, 19),
                4.0f
        ));

        students.add(new Student (
                2,
                "Billy",
                "Bob",
                LocalDate.of(1999, 04, 27),
                2.8f
        ));

        return students;
    }
}
