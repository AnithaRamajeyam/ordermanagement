package com.toyota.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	@Column(name = "seriesName")
	private String seriesName;
	@Column(name = "modelName")
	private String modelName;
	@Column(name = "price")
	private int price;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private List<OrderAccessory> orderAccessory;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private List<OrderColor> orderColor;
	
	public Orders()
	{
		super();
	}
	
	public Orders(String seriesName, String modelName, int price) {
		super();
		this.seriesName = seriesName;
		this.modelName = modelName;
		this.price = price;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<OrderAccessory> getOrderAccessory() {
		return orderAccessory;
	}

	public void setOrderAccessory(List<OrderAccessory> orderAccessory) {
		this.orderAccessory = orderAccessory;
	}

	public List<OrderColor> getOrderColor() {
		return orderColor;
	}

	public void setOrderColor(List<OrderColor> orderColor) {
		this.orderColor = orderColor;
	}

	}