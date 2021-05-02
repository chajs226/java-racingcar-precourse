package com.chajs226.racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNames {

	List<String> carNames = new ArrayList<String>();
	
	CarNames(String inputNames) {		
		this.carNames = parsingInputNames(inputNames);
		validateInputNames(carNames);
	}
	
	public List<String> parsingInputNames(String inputNames) {
		List<String> namesList = new ArrayList<String>();
		namesList = Arrays.asList(inputNames.split(","));
		return namesList; 
	}
	
	// 파싱된 이름 문자열이 5자 이상인지 검증
	public void validateInputNames(List<String> inputNames) {
		for (String inputName : inputNames) {
			if (inputName.length() > 5)
				throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
		}		
	}
	
	public List<String> getCarNamesList() {
		return carNames;
	}	
}
