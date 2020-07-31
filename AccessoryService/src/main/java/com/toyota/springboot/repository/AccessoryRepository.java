package com.toyota.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.toyota.springboot.model.Accessory;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long>{

	@Query(value="select * from accessory a where a.model_id=:modelId",nativeQuery=true)
	List<Accessory> findAccessoryByModelId(@Param("modelId")long modelId);

}
