package com.bridgelabz.employeepayrollsetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class EmployeepayrollsetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeepayrollsetupApplication.class, args);
		log.info("Employee payroll app started");
	}
}