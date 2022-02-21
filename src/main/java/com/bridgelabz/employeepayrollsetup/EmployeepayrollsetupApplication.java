package com.bridgelabz.employeepayrollsetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class EmployeepayrollsetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeepayrollsetupApplication.class, args);
//		log.info("Employee payroll app started in {} Enviroment",context.getEnviroment().getProperty("enviroment"));
//		log.info("Employee Payroll DB User is{}",context.getEnviroment().getProperty("spring.datasource.username"));
	}
}
