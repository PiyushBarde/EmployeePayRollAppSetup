package com.bridgelabz.employeepayrollsetup.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;

@Service
public class GreetingService {
	
	public String getWelcomeMsg(EmployeeModel employee) {
		return "Welcome " + employee.getFirstName() + " " + employee.getLastName();
	}
}
