package com.toyota.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyota.springboot.model.Orders;
import com.toyota.springboot.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public Orders saveOrder(Orders order) {
		
		return orderRepository.save(order);

	}

}
