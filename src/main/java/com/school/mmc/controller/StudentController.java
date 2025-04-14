package com.school.mmc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.mmc.Student;
import com.school.mmc.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String welcomeToSchool() {
		String welcomeNote = "Welcome to School";
		return welcomeNote;
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudent() {
		return studentService.getStudents();
	}
	
	@GetMapping("/getStudentByRollNo/{roll}")
	public Optional<Student> getAllStudentByRoll(@PathVariable int roll) {
		return studentService.getStudentByRollNo(roll);
	}
	
	@PostMapping("/addStudents")
	public void addStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}
	
	@PutMapping("/updateStudent/{roll}")
	public void updateStudent(@RequestBody Student student,@PathVariable int roll) {
		studentService.updateStudentData(student,roll);
	}
	
//	@PutMapping("/students/updateStudentCourse/{roll}")
//	public void updateStudentCourse(@RequestParam ,@PathVariable int roll) {
//		studentService.updateStudentData(student,roll);
//	}
	
	@DeleteMapping("/deleteStudent/{roll}")
	public void deleteStudentByRoll(@PathVariable int roll) {
		studentService.deleteStudentByRollNo(roll);
	}

}
