package com.example.jpa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@controller+@responseBody
//run--> maven goal --> clean install & run

@RestController

public class EmployeeController { 
	
	
	@Value("${app.name}")
	public String appName;
	
	@GetMapping("/e")
	public String getEmpData() {
		return "welcome to Compney " +appName;
	}
	
	@GetMapping("/e1")
	public String getEmpData1() {
		return "welcome to Compney1 " +appName;
	}
	
	
	@GetMapping("/e2")
	public String getEmpData2() {
		return "welcome to Compney2 " +appName;
	}
	
	@PostMapping("/employee")
	public String saveEmployye(@RequestBody Employee1 employee) {
		System.out.println(employee);
		return "employye details " + employee;
	}
	
	@GetMapping("/employee")
	public String getEmployye() {
		return"employye details list" ;
	}
	
}
