package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {

		int 홍길동_kor = 80;
		int 홍길동_math = 100;
		int 홍길동_eng = 90;
		
		int 홍길동_total = 홍길동_kor + 홍길동_math + 홍길동_eng;
		
		int 이몽룡_kor = 99;
		int 이몽룡_eng  = 88;
		int 이몽룡_math = 77;
		
		// ScoreVO 클래스에 디자인된 코드를 보면
		// 변수들이 있고
		// getTotal(), getAvg() method가 있다.
		// ScoreVO 클래스를 사용하여 만들어진 객체는
		// 일부러 다른 데이터를 저장하지 않는한
		// 같은 사람의 데이터일 것이고
		// 과목점수만 잘 저장되어있으면
		// 언제든지 총점과 평균을 method를 통해서
		// 얻어 낼 수 있다.
		ScoreVO 홍길동 = new ScoreVO();
		홍길동.num = 1;
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 100;
		
		System.out.println("홍길동 총점 : " 
						+ 홍길동.getTotal());
		System.out.println("홍길동 평균 : " 
						+ 홍길동.getAvg());
		
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.num = 2;
		이몽룡.kor = 99;
		이몽룡.eng = 88;
		이몽룡.math = 100;
		
		System.out.println("이몽룡 총점 : " 
					+ 이몽룡.getTotal());
		System.out.println("이몽룡 평균 : "
					+ 이몽룡.getAvg());
		
	}

}
