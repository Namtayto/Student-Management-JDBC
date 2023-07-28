package com.nam.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nam.sm.DAO.StudentDAO;
import com.nam.sm.api.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		List<Student> studentList = studentDAO.loadStudents();
		
		model.addAttribute("students", studentList);
		for(Student temp:studentList) {
			System.out.println(temp);
		}
		return "student-list";
	}
}
