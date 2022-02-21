package com.bridgelabz.employeepayrollsetup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollsetup.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollsetup.dto.ResponseDTO;
import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;
import com.bridgelabz.employeepayrollsetup.service.GreetingService;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeAppController {
	
	@Autowired
	GreetingService service;
	@GetMapping("")
	public String welcomeEmployee() {
		 return "Welcome to Employee Payroll App";
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> welcomeEmployeeAndToDataBase(@RequestBody EmployeeDTO dto) {
		 ResponseDTO responseDTO = new ResponseDTO("Employee Added : ",service.creatDataBase(dto));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeModel> getEmployeeByid(@PathVariable Integer id){
		return new ResponseEntity<EmployeeModel>(service.findEmployee(id),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> getEmployeeByid(@PathVariable Integer id,@RequestBody EmployeeDTO dto){
		ResponseDTO responseDTO = new ResponseDTO("Employee Updated : ",service.updateEmpolyeeByid(id, dto));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployeeByid(@PathVariable Integer id){
		service.deleteEmployee(id);
		return "Employee data deleted";
	}
}
