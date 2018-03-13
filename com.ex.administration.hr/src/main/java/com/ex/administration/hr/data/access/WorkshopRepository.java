package com.ex.administration.hr.data.access;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ex.administration.hr.data.model.Workshop;

@Repository
public interface WorkshopRepository extends PagingAndSortingRepository<Workshop, Integer> {
}
