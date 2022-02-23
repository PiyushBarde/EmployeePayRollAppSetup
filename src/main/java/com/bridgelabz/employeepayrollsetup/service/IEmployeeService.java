package com.bridgelabz.employeepayrollsetup.service;

import java.util.List;

import com.bridgelabz.employeepayrollsetup.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;

public interface IEmployeeService {
	public EmployeeModel getEmployeeById(Integer id);
	
	public EmployeeModel saveEmployee(EmployeeDTO dto);
	
	public String getWelcomeMsg(EmployeeModel employee);
	
	public EmployeeModel updateEmpolyeeByid(Integer id, EmployeeDTO dto);
	
	public void deleteEmployee(Integer id);
	
	public List<EmployeeModel> getListOfEmployee();
	
}
