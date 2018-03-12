package com.ex.administration.hr.data.access;

import org.springframework.data.repository.CrudRepository;

import com.ex.administration.hr.data.model.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer> {

}
