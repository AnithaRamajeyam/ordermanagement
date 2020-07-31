package com.toyota.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toyota.springboot.model.Accessory;
import com.toyota.springboot.service.AccessoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/accessory")
public class AccessoryController {
	@Autowired
	AccessoryService accessoryService;

	@RequestMapping(value = "/{modelId}", method = RequestMethod.GET)
	public List<Accessory> getAccesory(@PathVariable long modelId) {
		return accessoryService.findAccessoryByModelId(modelId);

	}
}
