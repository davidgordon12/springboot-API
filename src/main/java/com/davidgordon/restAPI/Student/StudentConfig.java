package com.davidgordon.restAPI.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
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

            repository.saveAll(students);
        };
    }
}
