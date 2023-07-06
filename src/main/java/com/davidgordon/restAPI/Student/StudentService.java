package com.davidgordon.restAPI.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findByLastName(student.getLastName());
        if(studentOptional.isPresent()) {
           throw new IllegalStateException("Student already exists");
        }
        else {
            studentRepository.save(student);
        }


        return student;
    }

    public Student deleteStudent(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("Student with id" + id + " does not exist"));

        studentRepository.delete(student);

        return student;
    }

    @Transactional
    public Student updateStudentGPA(Integer id, Float gpa) {
        Student student = studentRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("Student with id" + id + " does not exist"));

        if(gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA out of bounds! Must be between 0.00 and 4.00");
        }
        else {
            student.setGpa(gpa);
            studentRepository.save(student);
        }

        return student;
    }
}
