package com.ex.administration.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.administration.hr.data.model.Employee;
import com.ex.administration.hr.service.HumanResourcesService;

@RestController
@RequestMapping("/hr")
public class HumanResourcesController {

	@Autowired
	private HumanResourcesService humanResourcesService;

	@GetMapping("/employees/{lastname}")
	public List<Employee> getEmployeesByLastName(@PathVariable String lastName) {
		return humanResourcesService.getEmployeesByLastName(lastName);
	}
}
