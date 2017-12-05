package com.brushmyskills.docker.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.brushmyskills.docker.model.Employee;

@Service
public class EmployeeService {

	private static List<Employee> employeeList = Arrays.asList(new Employee(1, "Ram Kumar"),
			new Employee(2, "Deepak Singh"), new Employee(3, "Avart Krishnan"), new Employee(4, "Abash Kumar"),
			new Employee(5, "Manoj Kumar"));

	public List<Employee> getAllEmployee() {
		return EmployeeService.employeeList;

	}

	public Employee getEmployee(Integer empId) {
		Employee empRet;
		Optional<Employee> optionalEmp = 
				 getAllEmployee()
				 .stream()
				 .filter(employee -> employee.getId().equals(empId))
				.findFirst();
		if (optionalEmp.isPresent()) {
			empRet = optionalEmp.get();
		} else {
			empRet = null;
		}

		return empRet;

	}

}
