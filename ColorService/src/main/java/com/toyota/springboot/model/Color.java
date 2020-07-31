package com.toyota.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color {

	@Id
	@Column(name = "color_id")
	private long colorID;

	@Column(name = "color_name")
	private String colorName;
	
	@Column(name = "color_price")
	private long price;

	public long getColorID() {
		return colorID;
	}

	public void setColorID(long colorID) {
		this.colorID = colorID;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
