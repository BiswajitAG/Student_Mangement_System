package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repositary.StudentRepositary;
import com.student.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	private StudentRepositary studentRepositary;
//	**********THIS IS FOR IF WE ARE NOT USING AUTOWOIRED AUNOTATION*********
//	public StudentServiceimpl(StudentRepositary studentRepositary) {
//		super();
//		this.studentRepositary = studentRepositary;
//	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepositary.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepositary.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepositary.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepositary.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepositary.deleteById(id);	
	}


}
