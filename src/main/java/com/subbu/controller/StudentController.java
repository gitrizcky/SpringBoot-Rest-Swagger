package com.subbu.controller;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping(value = "/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		Student stu = studentService.saveStudent(student);

		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity deleteStudent(@PathVariable Integer id) {

		studentService.deleteStudent(id);

		return new ResponseEntity("Student Delete Successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {

		Student student = studentService.findStudentById(id);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Student> updateStudnet(@PathVariable Integer id, @RequestBody Student student) {

		Student stud = studentService.findStudentById(id);
		Student student1 = studentService.updateStudnet(stud,id);
		

		return new ResponseEntity<Student>(student1, HttpStatus.OK);
	}

}
