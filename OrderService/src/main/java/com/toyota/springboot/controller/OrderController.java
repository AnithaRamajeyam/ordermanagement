package com.toyota.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toyota.springboot.model.Orders;
import com.toyota.springboot.service.OrderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseEntity<Orders> placeOrder(@RequestBody Orders order){
		Orders orderdto=orderService.saveOrder(order);
		return ResponseEntity.ok().body(orderdto);
		
	}
	
}
