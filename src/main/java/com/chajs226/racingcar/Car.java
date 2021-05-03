package com.chajs226.racingcar;

public class Car {

	private CarName name;
	private RandomNumber randomNumber;
	private Distance movedDistances;	

	Car(String carName) {
		
		name = new CarName(carName);	
		movedDistances = new Distance();
	}
	
	public String getCarName() {
		return this.name.getCarName();
	}
	
	public void setRandomNumber(RandomNumber randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	public void move() {
		if(randomNumber.getRandomNumber() > 3) {
			movedDistances.moveForward(); 
		}
	}
	
	public String getMovedDistances() {
		return movedDistances.getDistace();
	}
}
