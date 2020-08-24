package com.subbu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.modal.Student;
import com.subbu.service.StudentService;

@RestController
@RequestMapping(name = "student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(name = "save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		Student stu = studentService.saveStudent(student);

		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
	}
}
