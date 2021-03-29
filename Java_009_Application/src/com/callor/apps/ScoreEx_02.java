package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_02 {
	
	/*
	 * ScoreVO 클래스를 디자인하고
	 * 클래스를 사용하여 객체를 생성한 후 사용하기
	 */
	public static void main(String[] args) {
		
		// 객체이름을 "홍길동"으로 하여 "객체 생성"
		ScoreVO 홍길동 = new ScoreVO();
		
		// 객체.맴버변수 : 
		//		점(DOT . ) 연결연산자
		//		객체 연결연산자
		// 		클래스(객체) 선언된 변수나, method에
		//		접근하기 위한 연산자
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 88;
		홍길동.math = 77;
		
		// 객체.method()
		//		객체 연결연산자를 통해서
		//		getTotal() method를 호출(실행)하고
		//		return 된 결과를 total 변수에 담아라
		int total = 홍길동.getTotal();
		float avg = 홍길동.getAvg();
		
		
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.kor = 88;
		이몽룡.eng = 77;
		이몽룡.math = 99;
		
		total = 이몽룡.getTotal();
		avg = 홍길동.getAvg();
		
		// 객체 연결연산자를 통하여
		// 맴버변수나 method에 접근을 하면
		// 오타등으로 발생하는 오류를 최소화 할수 있다
		// 코딩의 자동완성 기능을 충분히 활용할수 있다.
		이몽룡.kor = 100;
		이몽룡.eng = 90;
		
	}

}
