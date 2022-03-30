package com.h2.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.demo.EmpRepository;
import com.h2.demo.Employee;
@Service
public class empService {
	@Autowired
	EmpRepository emRepository;
	

	@SuppressWarnings("null")
	public List<Employee> getAll() {
		
		empService empRepository = null;
		return empRepository.getAll();
	}

}
