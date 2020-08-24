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

		return studentJpa.save(student);
	}

	public void deleteStudent(Integer studentId) {

		try {

			Student student = studentJpa.findById(studentId).get();

			if (student != null) {
				System.out.println("DeletIng  Student  Details.. " + student);
				studentJpa.delete(student);
			}
		} catch (Exception e) {
			System.out.println("Student Not Found....");
		}

	}

	public Student findStudentById(Integer id) {

		Student student = null;
		try {

			student = studentJpa.findById(id).get();

			if (student != null) {
				System.out.println("DeletIng  Student  Details.. " + student);
				studentJpa.delete(student);
			}
		} catch (Exception e) {
			System.out.println("Student Not Found....");
		}
		return student;
	}

	public Student updateStudnet(Student stu, Integer id) {
		// Student student = null;
		try {

			// student = studentJpa.findById(id).get();

			if (stu != null) {
				System.out.println("DeletIng  Student  Details.. " + stu);

				studentJpa.save(stu);
			}
		} catch (Exception e) {
			System.out.println("Student Not Found....");
		}
		return stu;
	}

}
