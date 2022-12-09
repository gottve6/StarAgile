/**
 * 
 */
package com.dxc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Optional<Employee> getEmployeeById(@PathVariable("emp_id") int emp_id) {
		
		return repo.findById(emp_id);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee emp = repo.save(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	/*
	 * @GetMapping("/employees") public Employee getAllEmployee() {
	 * 
	 * }
	 */
}
