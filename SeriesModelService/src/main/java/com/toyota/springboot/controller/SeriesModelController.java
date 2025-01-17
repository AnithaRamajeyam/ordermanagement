package com.toyota.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toyota.springboot.model.Model;
import com.toyota.springboot.model.Series;
import com.toyota.springboot.service.ModelService;
import com.toyota.springboot.service.SeriesService;

@RestController
@RequestMapping("/seriesmodel")
@CrossOrigin(origins = "http://localhost:4200")
public class SeriesModelController {
	
	@Autowired
	SeriesService seriesService;
	
	@Autowired
	ModelService modelService;
	
	@RequestMapping(value = "/series",method = RequestMethod.GET)
	public List<Series> getSeries() {
		return seriesService.getAllSeries();
			
	}
	@RequestMapping(value = "/model/{seriesId}",method = RequestMethod.GET)
	public List<Model> getModel(@PathVariable("seriesId") long seriesId) {
		return modelService.findModelBySeriesId(seriesId);
			
	}

}
