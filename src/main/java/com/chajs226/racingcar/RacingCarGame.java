package com.chajs226.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

	Scanner scan;
	private int random;
	private List<Car> cars;
	
	public RacingCarGame() {
		scan = new Scanner(System.in);
		cars = new ArrayList<Car>();
	}
	
	@Override
	protected void finalize() throws Throwable {
		scan.close();
	}
	
	
	public void startGame() {		
		setPlayer();	
		setTryNumber();
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
	
	public void setTryNumber() {
		int inputTryNumber;
		System.out.println("시도할 횟수는 몇회인가요?");		
		inputTryNumber = scan.nextInt();
		//TODO: 숫자로 안들어온 값을 validate해야하는지, 말아야 하는지 (그냥 두면 exception이 나는데)

	}	

}
