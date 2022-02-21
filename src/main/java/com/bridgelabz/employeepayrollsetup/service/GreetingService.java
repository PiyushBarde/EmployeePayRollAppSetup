package com.bridgelabz.employeepayrollsetup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollsetup.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;
import com.bridgelabz.employeepayrollsetup.repository.EmployeeAppRepository;

@Service
public class GreetingService {
	
	@Autowired
	EmployeeAppRepository repo;
	
	public EmployeeModel saveToDB(EmployeeDTO dto) {
		EmployeeModel employee = new EmployeeModel(dto);
		repo.save(employee);
		return employee;
	}
	public String getWelcomeMsg(EmployeeModel employee) {
		return "Welcome " + employee.getFirstName() + " " + employee.getLastName();
	}
	public EmployeeModel findEmployee(Integer id) {
		EmployeeModel employee= repo.getById(id);
		return employee;
	}
	public EmployeeModel updateEmpolyeeByid(Integer id, EmployeeDTO dto) {
		EmployeeModel employee = new EmployeeModel(id,dto); 
		repo.save(employee);
		return employee;
	}
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}
	public List<EmployeeModel> getListOfEmployee() {
		List<EmployeeModel> allEmployees = repo.findAll();
		return allEmployees;
	}
}
