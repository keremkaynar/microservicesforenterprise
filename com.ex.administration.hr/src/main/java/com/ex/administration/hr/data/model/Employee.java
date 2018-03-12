package com.ex.administration.hr.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Employee {

  @Id
  @GeneratedValue
  private Integer employeeId;

  private String firstName;

  private String lastName;

  private String address;

  @OneToOne
  private Profile profile;

  @ManyToMany
  private List<Workshop> joinedWorkshops = new ArrayList<>();
}
