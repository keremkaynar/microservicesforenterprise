package com.ex.administration.hr.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Workshop {

  @Id
  @GeneratedValue
  private Integer workshopId;

  private String description;

  private String place;

  private double budget;

  @ManyToMany
  private List<Employee> joinedEmployees = new ArrayList<>();
}
