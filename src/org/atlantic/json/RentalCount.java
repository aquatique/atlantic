package org.atlantic.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class RentalCount {
	
	@JsonProperty("lastweek")
	private int lastWeek;
	@JsonProperty("yeartodate")
	private int yearToDate;
	
	public int getLastWeek() {
		return lastWeek;
	}
	public void setLastWeek(int lastWeek) {
		this.lastWeek = lastWeek;
	}
	public int getYearToDate() {
		return yearToDate;
	}
	public void setYearToDate(int yearToDate) {
		this.yearToDate = yearToDate;
	}
	@Override
	public String toString() {
		return "RentalCount [lastWeek=" + lastWeek + ", yearToDate=" + yearToDate + "]";
	}
}
