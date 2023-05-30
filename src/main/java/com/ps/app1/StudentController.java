package com.ps.app1;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/get")
	public Student getStudent() {
		Student student=new Student(1,"Akhil Kumar","18D41A0246","EEE");
		return student;
	}
	@GetMapping("/gets")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(2,"Sandeep","18D41A0245","EEE"));
		students.add(new Student(3,"Anji","18D41A0217","EEE"));
		students.add(new Student(4,"Anuvardhan","18D41A0207","EEE"));
		return students;
	}
	@PostMapping("/post")
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getUsn());
		System.out.println(student.getBranch());
		return student;
	}
	
}
