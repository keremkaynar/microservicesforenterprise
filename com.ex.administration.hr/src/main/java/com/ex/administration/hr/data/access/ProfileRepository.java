package com.ex.administration.hr.data.access;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ex.administration.hr.data.model.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {

  @Query("Select p from Profile p where p.superior.employeeId=:superiorId")
  List<Profile> findProfilesBySuperiorId(@Param("superiorId") Integer superiorId);
}
