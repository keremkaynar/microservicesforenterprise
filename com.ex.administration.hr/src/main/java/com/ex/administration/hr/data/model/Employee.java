package com.ex.administration.hr.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

  @OneToOne(fetch = FetchType.EAGER)
  private Profile profile;

  @ManyToMany(fetch = FetchType.EAGER)
  private List<Workshop> joinedWorkshops = new ArrayList<>();
}
