package com.filter.filterspring.farmacy.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filter.filterspring.farmacy.persistence.Farmacy;

@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy, Long> {

}