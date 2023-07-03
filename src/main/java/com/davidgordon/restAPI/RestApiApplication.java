package com.davidgordon.restAPI;

import com.davidgordon.restAPI.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
@RestController
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Get student info at /students";
	}

	@GetMapping("/students")
	public List<Student> students() {
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
