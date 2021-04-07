package com.callor.method.service;

public class ScoreServiceV3 {
	
	protected InputServiceV2 inService;
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		
		int sum = intKor + intEng + intMath;
		float avg = (float)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}
}
