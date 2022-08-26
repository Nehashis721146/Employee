package com.example.mongocrud.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongocrud.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

	

}
