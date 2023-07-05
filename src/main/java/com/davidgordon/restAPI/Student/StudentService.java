package com.davidgordon.restAPI.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
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
                LocalDate.of(2001, 1, 19),
                4.0f
        ));

        students.add(new Student (
                3,
                "Billy",
                "Bob",
                LocalDate.of(1999, 4, 27),
                2.8f
        ));

        return students;
    }
}
