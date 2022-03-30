package com.h2.demo.entity;

public class Employee {
	private int EmployeeID;
	private String Name;
	private double Salary;
	private String State;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeID, String name, double salary, String state) {
		super();
		EmployeeID = employeeID;
		Name = name;
		Salary = salary;
		State = state;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

}
