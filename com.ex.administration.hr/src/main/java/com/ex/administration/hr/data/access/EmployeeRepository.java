package com.ex.administration.hr.data.access;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ex.administration.hr.data.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

  Optional<Employee> findByEmployeeId(Integer employeeId);
}
