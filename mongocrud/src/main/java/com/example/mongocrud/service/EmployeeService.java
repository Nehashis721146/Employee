package com.example.mongocrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.mongocrud.Repository.EmployeeRepository;
import com.example.mongocrud.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveOrUpdate(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	  public List<Employee> getDetails(){ 
		  return employeeRepository.findAll();
		  }
	 public Optional<Employee> getDetailsByID(@PathVariable int id){
		return employeeRepository.findById(id);
		 
	 }
	  
	  
	  
	  
	  public String delete(@PathVariable int id) {
		  
		  employeeRepository.deleteById(id);
		  return "deleted SuceessFully";
	  }
		/*
		 * public List<Employee> getDetailsByID(int id) { // TODO Auto-generated method
		 * stub return null; }
		 */
}
