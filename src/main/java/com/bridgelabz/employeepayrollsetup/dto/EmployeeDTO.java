package com.bridgelabz.employeepayrollsetup.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeeDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z]{2,}",message = "invalid first name first word must be capital")
	private String firstName;
	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z]{2,}",message = "invalid last name first word must be capital")
	private String lastName;
	@NotBlank(message = "profile picture must be filled")
	private String profilepic;
	@NotEmpty(message = "department must be filled")
	private String department;
	@Min(value = 1000,message = "salary must be more than 1000")
	private long salary;
	@NotNull(message = "format should be YYYY-MM-DD")
    private LocalDate date;
	@NotEmpty(message = "notes must be filled")
    private String notes;
    
    public EmployeeDTO() {}
   
	public EmployeeDTO(String firstName, String lastName, String profilePic, String department, long salary,
			LocalDate date, String notes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilepic = profilePic;
		this.department = department;
		this.salary = salary;
		this.date = date;
		this.notes = notes;
	}
}
