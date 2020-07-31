package com.toyota.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toyota.springboot.model.Color;
import com.toyota.springboot.service.ColorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/color")
public class ColorController {
	@Autowired
	ColorService colorService;

	@RequestMapping(value = "/{modelId}", method = RequestMethod.GET)
	public List<Color> getColor(@PathVariable("modelId") long modelId) {
		return colorService.findColorByModelId(modelId);

	}
}
