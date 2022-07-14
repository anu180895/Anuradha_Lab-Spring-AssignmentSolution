package com.greatlearning.student.studentmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.studentmanagement.model.Student;
import com.greatlearning.student.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student findStudentById(Integer studentId) {
		Optional<Student> studentOptional = studentRepo.findById(studentId);
		if(studentOptional.isPresent()) {
			return studentOptional.get();
		}
		return null;
	}

	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		studentRepo.deleteById(studentId);
	}

}
