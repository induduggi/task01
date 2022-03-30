package com.h2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.demo.Employee;

import java.util.List;

@RestController
@RequestMapping("/emp")

public class EmpController {
	 
	private EmpController empService;

	@Autowired
	@GetMapping("/get/all")
	public List<Employee> getAll(){
		
	
		return empService.getAll();
		
	}

}
