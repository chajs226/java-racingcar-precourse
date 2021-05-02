package com.chajs226.racingcar;

import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

	Scanner scan;
	private int random;
	private List<Car> cars;
	
	public RacingCarGame() {
		scan = new Scanner(System.in);
	}
	
	@Override
	protected void finalize() throws Throwable {
		scan.close();
	}
	
	
	public void startGame() {		
		setPlayer();	
		
	}
	
	public void setPlayer() {
		String inputCarNames = null;
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");		
		inputCarNames = scan.next();	
		CarNames carNames = new CarNames(inputCarNames);
		makeCars(carNames.getCarNamesList());
	}
	
	public void makeCars(List<String> carNames) {
		for (String carName : carNames) {
			Car car = new Car(carName);
			cars.add(car);
		}
	}
	

}
