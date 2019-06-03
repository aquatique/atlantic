package org.atlantic.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Madhushree Mazumdar
 *
 */
public class VehicleScanner {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Car> carList = new ArrayList<>();
		
		try {
			Cars cars = mapper.readValue(new File("cars.json"), Cars.class);
			
			for(Car car: cars.getCars()) {
				//System.out.println(car.toString());
				carList.add(car);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//printAllBlueTeslaWithNotes(carList);
		//printCarWithMaxProfit(carList);
		printCarWithLowestDailyRent(carList);
	}
	
	
	/**
	 * Question # 1
	 * @param cars
	 */
	public static void printAllBlueTeslaWithNotes(List<Car> cars) {
		
		for(Car car: cars) {
			if("Tesla".equalsIgnoreCase(car.getMake()) && "Blue".equalsIgnoreCase(car.getMetadata().getColor()) ) {
				System.out.println(car.toString());
			}
		}
		
	}
	
	/**
	 * Question # 2
	 * @param cars
	 */
	public static void printCarWithMaxProfit(List<Car> cars) {
		CarProfitComparator comp = new CarProfitComparator();
		Collections.sort(cars, comp);
		for(int i = 0; i < 3; i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	/**
	 * Question # 3.a
	 */
	public static void printCarWithLowestDailyRent(List<Car> cars) {
		Collections.sort(cars, new Comparator<Car>() {
			public int compare(Car car1, Car car2) {
				float car1Price = car1.getPerDayRent().getPrice();
				float car2Price = car2.getPerDayRent().getPrice();
				
				if(car1Price > car2Price) {
					return 1;
				}
				else if(car1Price < car2Price) {
					return -1;
				}
				return 0;
			}
		});
		for(int i = 0; i < 3; i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	/**
	 * Question # 3.b
	 */
	public static void printCarWithLowestDailyRentAfterDiscount(List<Car> cars) {
		Collections.sort(cars, new Comparator<Car>() {
			public int compare(Car car1, Car car2) {
				float car1Price = car1.getPerDayRent().getPrice() - car1.getPerDayRent().getDiscount();
				float car2Price = car2.getPerDayRent().getPrice() - car2.getPerDayRent().getDiscount();
				
				if(car1Price > car2Price) {
					return 1;
				}
				else if(car1Price < car2Price) {
					return -1;
				}
				return 0;
			}
		});
		for(int i = 0; i < 3; i++) {
			System.out.println(cars.get(i).toString());
		}
	}
}
