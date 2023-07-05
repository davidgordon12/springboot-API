package com.davidgordon.restAPI.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        List<Student> students = studentService.getStudents();

        if(students.size() == 0) {
            return new ArrayList<>();
        }

        return students;
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

        return student;
    }
}
