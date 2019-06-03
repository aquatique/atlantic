package org.atlantic.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class Car {
	
	@JsonProperty("make")
	private String make;
	@JsonProperty("model")
	private String model;
	@JsonProperty("vin")
	private String vin;
	@JsonProperty("metadata")
	private Metadata metadata;
	@JsonProperty("perdayrent")
	private PerDayRent perDayRent;
	@JsonProperty("metrics")
	private Metrics metrics;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public PerDayRent getPerDayRent() {
		return perDayRent;
	}
	public void setPerDayRent(PerDayRent perDayRent) {
		this.perDayRent = perDayRent;
	}
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	
	public float getProfit() {
		float profit = 0;
		float price = getPerDayRent().getPrice();
		float discount = getPerDayRent().getDiscount();
		float maintenance = getMetrics().getYoyMaintenanceCost();
		float depreciation = getMetrics().getDepreciation();
		int rentalCount = getMetrics().getRentalCount().getYearToDate();
		float revenue = (price - discount) * rentalCount;
		float expense = maintenance + depreciation;
		profit = revenue - expense;
		return profit;
	}
	
	public float priceAfterDiscount() {
		return getPerDayRent().getPrice() - getPerDayRent().getDiscount();
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perDayRent="
				+ perDayRent + ", metrics=" + metrics + "]";
	}
}
