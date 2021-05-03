package com.chajs226.racingcar;

public class CarName {
	private String name;
	
	CarName(String carName) {
		SetCarName(carName);
	}
	
	public void SetCarName(String carName) {
		this.name = carName;
		validateName();
	}
	
	public void validateName() {
		if (this.name.length() > 5)
			throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
	}	
	
	public String getCarName() {
		return this.name;
	}
}
