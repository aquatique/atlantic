package com.apple.interview.java.json;

import java.util.Comparator;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class CarProfitComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		
		float car1Profit = car1.getProfit();
		float car2Profit = car2.getProfit();
		
		if(car1Profit > car2Profit) {
			return -1;
		}
		else if(car1Profit < car2Profit) {
			return 1;
		}
		return 0;
	}
}
