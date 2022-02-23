package com.bridgelabz.employeepayrollsetup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollsetup.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;
import com.bridgelabz.employeepayrollsetup.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollsetup.repository.EmployeeAppRepository;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeAppRepository repo;
	
	
	public EmployeeModel getEmployeeById(Integer id){
		Optional<EmployeeModel> employee = repo.findById(id);
		EmployeeModel employeeData =employee.stream()
				.filter(empData->empData.getId()==id)
				.findFirst()
				.orElseThrow(()-> new EmployeePayrollException("Employee Not found"));
		return employeeData;
	}
	
	public EmployeeModel saveEmployee(EmployeeDTO dto) {
		EmployeeModel employee = new EmployeeModel(dto);
		repo.save(employee);
		return employee;
	}
	
	public String getWelcomeMsg(EmployeeModel employee) {
		return "Welcome " + employee.getFirstName() + " " + employee.getLastName();
	}
	
	public EmployeeModel updateEmpolyeeByid(Integer id, EmployeeDTO dto) {
		Optional<EmployeeModel> employeetoUpdate = repo.findById(id);
		if(employeetoUpdate.isPresent()) {
			EmployeeModel employee = new EmployeeModel(id,dto);
			repo.save(employee);
			return employee;
		}
		else {
			throw new EmployeePayrollException("Employee Not found");
		}
	}
	
	public void deleteEmployee(Integer id) {
		Optional<EmployeeModel> employee = repo.findById(id);
		if(employee.isPresent()) {
			repo.deleteById(id);
		}
		else {
			throw new EmployeePayrollException("Employee Not found");
		}
	}
	
	public List<EmployeeModel> getListOfEmployee() {
		List<EmployeeModel> list = repo.findAll();
		if(list.isEmpty()) {
			throw new EmployeePayrollException("Employee payroll data is empty");
		}
		return list;
	}
}
