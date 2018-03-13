package com.ex.administration.hr.data.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Profile {

  @Id
  @GeneratedValue
  private Integer profileId;

  private Date startingDate;

  private String jobPosition;

  @OneToOne(fetch = FetchType.EAGER)
  private Employee employee;

  @ManyToOne
  private Employee superior;
}
