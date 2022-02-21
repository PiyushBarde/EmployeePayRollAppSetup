package com.bridgelabz.employeepayrollsetup.dto;

import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;

public class ResponseDTO {
	private String message;
	private EmployeeModel content;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EmployeeModel getContent() {
		return content;
	}
	public void setContent(EmployeeModel content) {
		this.content = content;
	}
	public ResponseDTO(String message, EmployeeModel content) {
		super();
		this.message = message;
		this.content = content;
	}
}
