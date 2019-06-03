package org.atlantic.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class PerDayRent {
	
	@JsonProperty("Price")
	private float price;
	@JsonProperty("Discount")
	private float discount;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "PerDayRent [price=" + price + ", discount=" + discount + "]";
	}
}
