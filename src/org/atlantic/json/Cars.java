package com.apple.interview.java.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class Cars {
	
	@JsonProperty("cars")
	List<Car> cars;

	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
