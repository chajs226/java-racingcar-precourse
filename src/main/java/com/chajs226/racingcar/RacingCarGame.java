package com.chajs226.racingcar;

import java.util.Scanner;

public class RacingCarGame {

	Scanner scan;	
	
	public void startGame() {
		// TODO Auto-generated method stub
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		
		String inputCarNames = scan.next();	
		CarNames carNames = new CarNames(inputCarNames);
		//car(carNames.get...) 해서 car 객체 생성
	
	}
}
