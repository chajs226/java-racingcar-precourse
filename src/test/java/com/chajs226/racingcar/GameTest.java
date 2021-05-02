package com.chajs226.racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {

	@DisplayName("횟수 입력에서 숫자가 아닌 값 입력했을 떄 오류 확인")
	@Test	
	public void test_inputTryNumber_not_number() {
		//Given
		String inputryNumber = "c";		
		RacingCarGame carGame = new RacingCarGame();
		
		//When
		carGame.setTryNumber();
				
		//When-Then		
		
	}

}
