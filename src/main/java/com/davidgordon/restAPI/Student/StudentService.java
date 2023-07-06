package com.davidgordon.restAPI.Student;

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

    public void deleteStudent(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if(!studentOptional.isPresent()) {
            throw new IllegalStateException("Student with id" + id + " does not exist");
        }
        else {
            studentRepository.deleteById(id);
        }
    }
}
