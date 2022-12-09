/**
 * 
 */
package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.Employee;
import com.dxc.repository.EmployeeRepository;

/**
 * @author vgottemukkal
 *
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	Employee employee = new Employee();

	@GetMapping("/{emp_id}")
	public Employee getEmployeeById(@PathVariable("emp_id") int emp_id) {
		return employee;
		
	}
	
	@PostMapping("/save")
	public void saveEmployee() {
		
		repo.save(employee);
	}
	/*
	 * @GetMapping("/employees") public Employee getAllEmployee() {
	 * 
	 * }
	 */
}
