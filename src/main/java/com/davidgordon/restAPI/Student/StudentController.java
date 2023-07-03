package com.davidgordon.restAPI.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/")
    public String home() {
        return "Get student info at /students";
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        List<Student> students = studentService.getStudents();

        if(students.size() == 0) {
            return new ArrayList<>();
        }

        return students;
    }
}
