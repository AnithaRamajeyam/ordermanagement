package com.toyota.springboot.service;

import java.util.List;

import com.toyota.springboot.model.Accessory;

public interface AccessoryService {
	
	List<Accessory> findAccessoryByModelId(long modelId);

}
