package com.chajs226.racingcar;

import java.util.Random;

public class RandomNumber {
	private int value;
	
	public RandomNumber() {
		this.value = 0;
		generateRandomNumber();
	}
	
	public void generateRandomNumber() {
		Random rd = new Random();	
		value = rd.nextInt(10);
	}
	
	public int getRandomNumber() {
		return this.value;
	}	
}
