package com.toyota.springboot.service;

import java.util.List;

import com.toyota.springboot.model.Color;

public interface ColorService {

	List<Color> findColorByModelId(long modelId);

}
