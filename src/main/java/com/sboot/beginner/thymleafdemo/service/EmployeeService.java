package com.sboot.beginner.thymleafdemo.service;

import java.util.List;

import com.sboot.beginner.thymleafdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
