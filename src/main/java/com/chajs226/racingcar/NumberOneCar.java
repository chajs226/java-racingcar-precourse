package com.chajs226.racingcar;

import java.util.ArrayList;
import java.util.List;

public class NumberOneCar {
	private List<Car> cars;
	
	NumberOneCar() {
		cars = new ArrayList<Car>();
	}
	
	public void add(Car car) {
		this.cars.add(car);
	}
	
	public void printResult() {
		if(cars.size() == 1) {
			System.out.print(cars.get(0).getCarName() + "가 최종 우승했습니다.");
			return;
		}
		
		for(int i=0; i<cars.size()-1; i++) {
			System.out.print(cars.get(i).getCarName() +", ");
		}
		System.out.print(cars.get(cars.size()-1).getCarName() +"가 최종 우승했습니다.");
		return;
	}
}
