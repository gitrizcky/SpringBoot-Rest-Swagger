package com.subbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.jpa.StudentJpa;
import com.subbu.modal.Student;

@Service
public class StudentService {

	@Autowired
	private StudentJpa studentJpa;

	public Student saveStudent(Student student) {

	return	studentJpa.save(student);
	}

}
