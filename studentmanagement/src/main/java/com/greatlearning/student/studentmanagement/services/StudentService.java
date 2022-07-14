package com.greatlearning.student.studentmanagement.services;

import java.util.List;
import com.greatlearning.student.studentmanagement.model.Student;

public interface StudentService {

	List<Student> findAllStudents();
	Student findStudentById(Integer studentId);
	void saveStudent(Student student);
	void deleteStudent(Integer studentId);
}
