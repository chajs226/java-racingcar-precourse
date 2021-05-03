package com.chajs226.racingcar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

	Scanner scan;
	private TryNumber tryNumber;
	private RandomNumber randomNumber;
	private List<Car> playerCars;
	private NumberOneCar numberOneCar;
	
	public RacingCarGame() {
		scan = new Scanner(System.in);
		playerCars = new ArrayList<Car>();
		numberOneCar = new NumberOneCar();
	}
	
	@Override
	protected void finalize() throws Throwable {
		scan.close();
	}
	
	
	public void startGame() {		
		setPlayer();	
		setTryNumber();
		System.out.println("실행 결과");
		for(int i=0; i<this.tryNumber.getTryNumber(); i++) {
	 		setRandomNumber();
			moveCars();		
		}
		showResult();
	}
	
	public void setPlayer() {
		String inputCarNames = null;
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");		
		inputCarNames = scan.next();	
		CarNamesList carNameList = new CarNamesList(inputCarNames);
		makeCars(carNameList.getCarNamesList());
	}
	
	public void makeCars(List<String> carNames) {
		for (String carName : carNames) {
			Car car = new Car(carName);
			playerCars.add(car);
		}
	}
	
	public void setTryNumber() {
		System.out.println("시도할 횟수는 몇회인가요?");		
		tryNumber = new TryNumber(scan.nextInt());
	}	
	
	protected void setRandomNumber() {
		for (Car car: playerCars) {			
			randomNumber = new RandomNumber();
			car.setRandomNumber(randomNumber);
		}
	}
	
	public void moveCars() {
		for (Car car: playerCars) {
			car.move();
			showMoving(car);
		}
		System.out.println("");						
	}
	
	public void showMoving(Car car) {
		System.out.print(car.getCarName() + " : ");
		System.out.println(car.getMovedDistances());		
	}
	
	public void showResult() {
		Car numberOneCarforDistance = Collections.max(playerCars, Comparator.comparing(s -> s.getMovedDistances()));
		String numberOneDistance = numberOneCarforDistance.getMovedDistances();
		for (Car car: playerCars) {
			findAllNumberOneCars(car, numberOneDistance);	
		}
		numberOneCar.printResult();
	}
	
	private void findAllNumberOneCars(Car car, String NumberOneDistance) {		
		if (car.getMovedDistances().equals(NumberOneDistance)) {
			numberOneCar.add(car);			
		}		
	}

}
