package com.bridgelabz.employeepayrollsetup.employeemodel;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.bridgelabz.employeepayrollsetup.dto.EmployeeDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
public class EmployeeModel {
	@Id
	@GeneratedValue
	private Integer id;
	//@Pattern(regexp = "^[A-Z]{1}[a-z A-Z]{1,}",message = "Invalid first name")
	private String firstName;
	@Pattern(regexp = "[a-z A-Z]{1,}",message = "Invalid name")
	private String lastName;
	
	private String profilepic;
	
	private String department;
	//@Min(value = 1000,message = "Enter salary more than 1000")
	private long salary;
	//@NotNull
    private LocalDate date;
    private String notes;
    
    
    public EmployeeModel() {
		super();
	}
    
	public EmployeeModel(Integer id, EmployeeDTO dto) {
		super();
		this.id = id;
		this.firstName = dto.getFirstName();
		this.lastName = dto.getLastName();
		this.profilepic = dto.getProfilepic();
		this.department = dto.getDepartment();
		this.salary = dto.getSalary();
		this.date = dto.getDate();
		this.notes = dto.getNotes();
	}

	public EmployeeModel(Integer id, String firstName, String lastName, String profilepic, String department,
			long salary, LocalDate date, String notes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilepic = profilepic;
		this.department = department;
		this.salary = salary;
		this.date = date;
		this.notes = notes;
	}

	public EmployeeModel(EmployeeModel employee) {
		super();
		this.id = employee.getId();
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.profilepic = employee.getProfilepic();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.date = employee.getDate();
		this.notes = employee.getNotes();
	} 
	public EmployeeModel(EmployeeDTO dto) {
		super();
		this.firstName = dto.getFirstName();
		this.lastName = dto.getLastName();
		this.profilepic = dto.getProfilepic();
		this.department = dto.getDepartment();
		this.salary = dto.getSalary();
		this.date = dto.getDate();
		this.notes = dto.getNotes();
	}
}
