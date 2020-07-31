package com.toyota.springboot.service;

import java.util.List;

import com.toyota.springboot.model.Model;

public interface ModelService {
	List<Model> findModelBySeriesId(long seriesId);
}
