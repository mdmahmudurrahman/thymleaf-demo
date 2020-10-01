package com.sboot.beginner.thymleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sboot.beginner.thymleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void prepareData() {
		Employee employee1 = new Employee(1, "AA", "BB", "a@a.a");
		Employee employee2 = new Employee(2, "CC", "DD", "c@a.a");
		Employee employee3 = new Employee(3, "EE", "FF", "e@a.a");
		Employee employee4 = new Employee(4, "FF", "GG", "f@a.a");
		
		theEmployees = new ArrayList<>();
		theEmployees.add(employee1);
		theEmployees.add(employee2);
		theEmployees.add(employee3);
		theEmployees.add(employee4);
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		theModel.addAttribute("employees", theEmployees);
		return "list-employees";
	}
	
	
}
