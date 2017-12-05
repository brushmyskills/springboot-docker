package com.brushmyskills.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.brushmyskills.docker.model.Employee;
import com.brushmyskills.docker.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	//Getting all employee informations
	@GetMapping("api/employees/")
	public  ResponseEntity<List<Employee>> getAllEmployee() {

		List<Employee> employeeList = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employeeList,HttpStatus.OK);

	}

	//Getting single employee information
	@GetMapping("api/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable(name = "id") Integer empId) {

		Employee employee = employeeService.getEmployee(empId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);

	}

}
