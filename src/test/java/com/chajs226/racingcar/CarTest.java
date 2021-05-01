package com.chajs226.racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

	List<String> nameList;
	
	@BeforeEach
	void init() {
		nameList = new ArrayList<String>();
	}
	
	@DisplayName(",가 없는 문자열 입력")
	@Test	
	public void test_inputNames_without_comma() {
		//Given
		String inputNames = "chajs";
		CarNames carNames = new CarNames(inputNames);		
		
		//When
		nameList = carNames.parsingInputNames(inputNames);
		
		//Then
		assertThat(nameList).contains("chajs");
	}
	
	@DisplayName(",로 이름 파싱 테스트")
	@Test	
	public void test_inputNames_with_comma() {
		//Given
		String inputNames = "chajs,pobi,crong,dian";
		CarNames carNames = new CarNames(inputNames);		
		
		//When
		nameList = carNames.parsingInputNames(inputNames);
		
		//Then
		assertThat(nameList).contains("chajs");
		assertThat(nameList).contains("pobi");
		assertThat(nameList).contains("crong");
		assertThat(nameList).contains("dian");
	}
	
	@DisplayName("자동차 이름이 5자를 초과했을 떄 오류 발생 확인")
	@Test	
	public void test_inputNames_more_than_five_letters() {
		//Given
		String inputNames = "chajs226";		

		CarNames carNames = new CarNames(inputNames);		
		nameList = carNames.parsingInputNames(inputNames);
		
		//When-Then
		assertThatThrownBy(() -> carNames.validateInputNames(nameList))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("자동차 이름은 5자 이하만 가능합니다.");
		
	}
	
}
