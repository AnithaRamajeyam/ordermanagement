package com.toyota.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyota.springboot.model.Series;
import com.toyota.springboot.repository.SeriesRepository;

@Service
public class SeriesServiceImpl implements SeriesService {

	@Autowired
	SeriesRepository seriesRepository;
	
	@Override
	public List<Series> getAllSeries() {
		// TODO Auto-generated method stub
		return seriesRepository.findAll();
	}

}
