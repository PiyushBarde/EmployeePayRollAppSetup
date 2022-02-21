package com.bridgelabz.employeepayrollsetup.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeeDTO {
	private String firstName;
	private String lastName;
	private String profilepic;
	private String department;
	private long salary;
    private LocalDate date;
    private String notes;
    
    public EmployeeDTO() {}
   
	public EmployeeDTO(String firstName, String lastName, String profilepic, String department, long salary,
			LocalDate date, String notes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilepic = profilepic;
		this.department = department;
		this.salary = salary;
		this.date = date;
		this.notes = notes;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
