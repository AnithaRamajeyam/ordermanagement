package com.toyota.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.toyota.springboot.model.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

	@Query(value = "select * from color c where c.model_id=:modelId", nativeQuery = true)
	List<Color> findColorByModelId(@Param("modelId") long modelId);

}
