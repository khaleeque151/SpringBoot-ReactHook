package com.myproject.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.springboot.model.Employee;
import com.myproject.springboot.exception.ResourceNotFoundException;
import com.myproject.springboot.repository.EmployeeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
		
	}
@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
@GetMapping({"id"})
public ResponseEntity<Employee>getEmployeeById(@PathVariable long id){
	Employee employee = employeeRepository.findById(id).orElseThrow(()->
	new ResourceNotFoundException("Employee not exist with id" +id));
	return ResponseEntity.ok(employee);
}
}
