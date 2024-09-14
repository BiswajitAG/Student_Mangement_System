package com.student.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;


public interface StudentRepositary extends JpaRepository<Student,Long> {

}
