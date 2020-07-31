package com.toyota.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyota.springboot.model.Accessory;
import com.toyota.springboot.repository.AccessoryRepository;

@Service
public class AccessoryServiceImpl implements AccessoryService {
	@Autowired
	AccessoryRepository accessoryRepository;

	@Override
	public List<Accessory> findAccessoryByModelId(long modelId) {
		// TODO Auto-generated method stub
		return accessoryRepository.findAccessoryByModelId(modelId);
	}

}
