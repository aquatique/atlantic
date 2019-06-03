package com.apple.interview.java.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class Metadata {
	
	@JsonProperty("Color")
	private String color;
	@JsonProperty("Notes")
	private String notes;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Metadata [color=" + color + ", notes=" + notes + "]";
	}
}
