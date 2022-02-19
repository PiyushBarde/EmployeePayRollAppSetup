package com.bridgelabz.employeepayrollsetup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;
import com.bridgelabz.employeepayrollsetup.repository.EmployeeAppRepository;

@Service
public class GreetingService {
	
	@Autowired
	EmployeeAppRepository repo;
	
	public EmployeeModel creatDataBase(EmployeeModel employee) {
		repo.save(employee);
		return employee;
	}
	
	public String getWelcomeMsg(EmployeeModel employee) {
		return "Welcome " + employee.getFirstName() + " " + employee.getLastName();
	}

	public EmployeeModel findEmployee(Integer id) {
		Optional<EmployeeModel> newEmployeeModel= repo.findById(id);
		return newEmployeeModel.get();
	}

	public EmployeeModel updateEmpolyeeByid(Integer id, EmployeeModel employee, String string) {
		EmployeeModel newEmployeeModel = new EmployeeModel(id,employee); 
		return newEmployeeModel;
	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}
}
