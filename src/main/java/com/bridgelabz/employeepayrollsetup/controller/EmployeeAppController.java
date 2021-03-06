package com.bridgelabz.employeepayrollsetup.controller;

import java.util.List;

import javax.validation.Valid;

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
import com.bridgelabz.employeepayrollsetup.service.EmployeeService;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeAppController {
	
	@Autowired
	EmployeeService service;
	@GetMapping("")
	public String welcomeEmployee() {
		 return "Welcome to Employee Payroll App";
	}
	
	@GetMapping("/get")
	public ResponseEntity<String>retriveData(){
		List<EmployeeModel> listOfEmployee = service.getListOfEmployee();
		ResponseDTO response = new ResponseDTO("Data of Employees", listOfEmployee);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> postData(@Valid @RequestBody EmployeeDTO dto) {
		 ResponseDTO responseDTO = new ResponseDTO("Employee Added : ",service.saveEmployee(dto));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeModel> getDataById(@PathVariable Integer id){
		ResponseDTO response = new ResponseDTO("Employee data retrived : ",service.getEmployeeById(id));
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateData(@PathVariable Integer id,@Valid @RequestBody EmployeeDTO dto){
		ResponseDTO responseDTO = new ResponseDTO("Employee Updated : ",service.updateEmpolyeeByid(id, dto));
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public String daleteData(@PathVariable Integer id){
		service.deleteEmployee(id);
		return "Employee data deleted";
	}
}
