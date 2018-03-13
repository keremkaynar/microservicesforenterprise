package com.ex.administration.hr.data.access;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ex.administration.hr.data.model.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

  List<Employee> findByLastName(String lastName);
}
