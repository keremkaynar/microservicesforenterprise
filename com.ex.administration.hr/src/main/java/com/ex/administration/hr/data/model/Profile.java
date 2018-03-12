package com.ex.administration.hr.data.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Profile {

  @Id
  @GeneratedValue
  private Integer profileId;

  private Date startingDate;

  private String jobPosition;

  @ManyToOne
  private Employee superior;
}
