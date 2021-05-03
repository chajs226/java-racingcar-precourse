package com.chajs226.racingcar;

import java.util.Random;

public class Distance {
	private String value;
	
	public Distance() {
		this.value = "";
	}

	public void moveForward() {
		value = value + "-";
	}

	public String getDistace() {
		return value;
	}
}
