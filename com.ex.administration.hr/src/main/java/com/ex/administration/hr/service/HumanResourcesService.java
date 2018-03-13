package com.ex.administration.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ex.administration.hr.data.access.EmployeeRepository;
import com.ex.administration.hr.data.access.ProfileRepository;
import com.ex.administration.hr.data.access.WorkshopRepository;
import com.ex.administration.hr.data.model.Employee;
import com.ex.administration.hr.data.model.Profile;
import com.ex.administration.hr.data.model.Workshop;

@Service
public class HumanResourcesService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Autowired
  private ProfileRepository profileRepository;

  @Autowired
  private WorkshopRepository workshopRepository;

  @Transactional(readOnly = true)
  public Page<Employee> getEmployees() {
    return employeeRepository.findAll(createPageRequestForEmployeeQuery());
  }

  @Transactional(readOnly = true)
  public List<Employee> getEmployeesByLastName(String lastName) {
    return employeeRepository.findByLastName(lastName);
  }

  @Transactional
  public Employee addEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  @Transactional(readOnly = true)
  public List<Profile> getProfilesOfWorkers(Integer employeeId) {
    return profileRepository.findProfilesBySuperiorId(employeeId);
  }

  @Transactional(readOnly = true)
  public Page<Workshop> getWorkShops() {
    return workshopRepository.findAll(createPageRequestForWorkshopQuery());
  }

  @Transactional
  public Workshop addWorkshop(Workshop workshop) {
    return workshopRepository.save(workshop);
  }

  private Pageable createPageRequestForEmployeeQuery() {
    return PageRequest.of(1, 10, Sort.Direction.ASC, "firstName", "lastName");
  }

  private Pageable createPageRequestForWorkshopQuery() {
    return PageRequest.of(1, 10, Sort.Direction.ASC, "budget", "date");
  }
}
