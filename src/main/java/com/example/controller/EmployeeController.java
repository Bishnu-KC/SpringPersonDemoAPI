package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRespository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRespository repo;
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public List<Employee> getAll()
	{
		return repo.findAll();

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee/{empId}")
	public Employee getOne(@PathVariable int empId) 
	{
		return repo.fineOne(empId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public Object addOne(@RequestBody Employee employee)
	{
		return repo.addOne(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{empId}")
	public int deleteOne(@RequestBody Employee employee, @PathVariable int empId) 
	{
		return repo.UpdateOne(employee);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{empId}")
	public int deleteOne(@PathVariable int empId) 
	{
		return repo.deleteOne(empId);
	}


}
