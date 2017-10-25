package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class EmployeeController {
	@GetMapping("/students")
	public List<StudentDTO> getStudents() {
		List<StudentDTO> students = new ArrayList<>();
		students.add(new StudentDTO("tony.tester@gmail.com", "Tony Tester",
				"master"));

		students.add(new StudentDTO("nick.newbie@gmail.com", "Nick Newbie",
				"starter"));
		students.add(new StudentDTO("ian.intermediate@gmail.com",
				"Ian Intermediate", "intermediate"));
		System.out.println(students);
		return students;
	}

	@GetMapping("/student")
	public StudentDTO getStudent() {
		return new StudentDTO("tony.tester@gmail.com", "Tony Tester", "master");

	}

}
