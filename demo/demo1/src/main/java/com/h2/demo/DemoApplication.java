package com.h2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;


@SpringBootApplication
public class DemoApplication {
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1,"Uday",20000,"Chennai");
		Employee e2 = new Employee(2,"Divya",20000,"Hyderabad");
		Employee e3 = new Employee(3,"Teja",20000,"Banglore");
		
		
		empRepository.employee.add((com.h2.demo.entity.Employee) Arrays.asList(e1,e2,e3));
		
		
		
	}
		

}
