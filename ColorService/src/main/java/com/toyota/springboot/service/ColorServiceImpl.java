package com.toyota.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyota.springboot.model.Color;
import com.toyota.springboot.repository.ColorRepository;

@Service
public class ColorServiceImpl implements ColorService {

	@Autowired
	ColorRepository colorRepository;
	
	@Override
	public List<Color> findColorByModelId(long modelId) {
		// TODO Auto-generated method stub
		return colorRepository.findColorByModelId(modelId);
	}

}
