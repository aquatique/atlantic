package org.atlantic.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class Metrics {
	
	@JsonProperty("yoymaintenancecost")
	private float yoyMaintenanceCost;
	@JsonProperty("depreciation")
	private float depreciation;
	@JsonProperty("rentalcount")
	private RentalCount rentalCount;
	
	public float getYoyMaintenanceCost() {
		return yoyMaintenanceCost;
	}
	public void setYoyMaintenanceCost(float yoyMaintenanceCost) {
		this.yoyMaintenanceCost = yoyMaintenanceCost;
	}
	public float getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(float depreciation) {
		this.depreciation = depreciation;
	}
	public RentalCount getRentalCount() {
		return rentalCount;
	}
	public void setRentalCount(RentalCount rentalCount) {
		this.rentalCount = rentalCount;
	}
	@Override
	public String toString() {
		return "Metrics [yoyMaintenanceCost=" + yoyMaintenanceCost + ", depreciation=" + depreciation + ", rentalCount="
				+ rentalCount + "]";
	}
}
