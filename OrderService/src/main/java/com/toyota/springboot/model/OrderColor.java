package com.toyota.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_color")
public class OrderColor {
	@Id
	@Column(name = "order_color_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderColorId;

	@Column(name = "color_name")
	private String colorName;

	@Column(name = "quantity")
	private String quantity;

	public OrderColor()
	{
		super();
	}
	public OrderColor(String colorName, String quantity) {
	super();
	this.colorName = colorName;
	this.quantity = quantity;
}

	public long getOrderColorId() {
		return orderColorId;
	}

	

	public void setOrderColorId(long orderColorId) {
		this.orderColorId = orderColorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
