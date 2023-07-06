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
        return studentService.getStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping({"deleteStudent/{id}"})
    public Student deleteStudent(@PathVariable("id") Integer id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping({"updateGPA/{id}/{gpa}"})
    public Student updateStudent(
            @PathVariable("id") Integer id,
            @PathVariable("gpa") Float gpa) {

        return studentService.updateStudentGPA(id, gpa);
    }
}
