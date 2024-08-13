package com.filter.filterspring.city.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filter.filterspring.city.persistence.City;

@Repository
public interface CityRepository extends JpaRepository<City, String> {

}