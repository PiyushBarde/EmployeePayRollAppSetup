package com.bridgelabz.employeepayrollsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.employeepayrollsetup.employeemodel.EmployeeModel;

public interface EmployeeAppRepository extends JpaRepository<EmployeeModel, Integer>{

}
