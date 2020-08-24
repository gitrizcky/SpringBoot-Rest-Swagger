package com.subbu.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subbu.modal.Student;

public interface StudentJpa extends JpaRepository<Student, Integer> {

}
