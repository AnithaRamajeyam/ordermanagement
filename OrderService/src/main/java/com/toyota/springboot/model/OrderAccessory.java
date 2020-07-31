package com.toyota.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_accessory")
public class OrderAccessory {

	@Id
	@Column(name = "order_accessory_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderAccessoryId;

	@Column(name = "accessory_name")
	private String accessoryName;


	public OrderAccessory() {
		super();
	}

	public OrderAccessory(String accessoryName) {
	super();
	this.accessoryName = accessoryName;
}

	public long getOrderAccessoryId() {
		return orderAccessoryId;
	}

	public void setOrderAccessoryId(long orderAccessoryId) {
		this.orderAccessoryId = orderAccessoryId;
	}

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

}
