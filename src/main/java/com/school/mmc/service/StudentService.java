package com.school.mmc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.school.mmc.Student;


@Service
public class StudentService {
	
	List<Student> studentList = new ArrayList<>(Arrays.asList(
		new Student(001,"Arghya","Python","Kolkata"),
		new Student(002,"Palash","java","KGP"),
		new Student(003,"Abhra","React","Bangalore"),
		new Student(004,"Ani","PHP","Hyderabad")
		));
	
	public List<Student> getStudents() {
		System.out.println("Inside getStudents");
		return studentList;
	}
	
	public Optional<Student> getStudentByRollNo(int roll) {
		System.out.println("Inside getStudentByRollNo with roll: "+roll);
		return studentList.stream().filter(e -> e.getRollNo() == roll).findFirst();
	}

	public void addNewStudent(Student student) {
		studentList.add(student);
		System.out.println("Inside addNewStudent with student: "+student.toString());
	}

	public void updateStudentData(Student student, int roll) {
		System.out.println("Inside updateStudentData with student: "+student.toString());
		if (studentList.stream().anyMatch(e -> e.getRollNo() == roll) ) {
			studentList.set(roll-1, student);
		} else {
			System.err.println("Failed to update Entry");
		}
	}

	public void deleteStudentByRollNo(int roll) {
		if (studentList.stream().anyMatch(e -> e.getRollNo() == roll) ) {
			studentList.remove(roll);
		} else {
			System.err.println("Failed to delete Entry");
		}
	}
	
}
