package com.example.mongocrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongocrud.model.Employee;
import com.example.mongocrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping
	public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
		
		return new ResponseEntity<Employee>(employeeService.saveOrUpdate(emp),HttpStatus.ACCEPTED);
	}
	@GetMapping
	public List<Employee> getDetails(){
		return employeeService.getDetails();
	}
	@GetMapping("/{id}")
	public Optional<Employee> getDetailsByID(@PathVariable int id){
		return employeeService.getDetailsByID(id);
	}
	@DeleteMapping("/{id}")
	public String deleted(@PathVariable int id) {
		return employeeService.delete(id);
	}
	
	
	
	
}
