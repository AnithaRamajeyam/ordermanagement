package com.toyota.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.toyota.springboot.model.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {

	@Query(value="select * from model m where m.series_id =:seriesId ",nativeQuery=true)
	List<Model> findModelBySeriesId(@Param("seriesId")long seriesId);
	
	}
