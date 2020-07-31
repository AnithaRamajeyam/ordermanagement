package com.toyota.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyota.springboot.model.Model;
import com.toyota.springboot.repository.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService{

	@Autowired
	ModelRepository modelRepository;
	
	@Override
	public List<Model> findModelBySeriesId(long seriesId) {
		// TODO Auto-generated method stub
		return modelRepository.findModelBySeriesId(seriesId);
	}

}
