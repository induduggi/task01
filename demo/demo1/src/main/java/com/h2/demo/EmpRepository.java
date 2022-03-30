package com.h2.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.h2.demo.entity.Employee;
@Repository

public class EmpRepository {
	 public List<Employee> employee = new ArrayList<Employee>();
	 public List<Employee>getAll(){
		return employee;
		 
	 }
	 public String add(Employee emp) {
		return "Successfully added";
				
		 
	 }
	 public String edit(Employee emp) {
		 employee.stream().filter(e-> e.getEmployeeID() == emp.getEmployeeID()).forEach(e->{ 
			 e.setName(emp.getName());
		     e.setSalary(emp.getSalary());
		     e.setState(emp.getState());
		 });
		return "Sucessfully Updated" ;
		 
	 }
	 

}
