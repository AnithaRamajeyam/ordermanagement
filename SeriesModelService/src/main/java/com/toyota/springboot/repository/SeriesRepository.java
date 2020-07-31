package com.toyota.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toyota.springboot.model.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Long> {

}
