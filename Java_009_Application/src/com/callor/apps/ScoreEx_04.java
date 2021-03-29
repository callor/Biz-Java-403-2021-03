package com.callor.apps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.callor.apps.model.ScoreVO;
import com.callor.apps.service.ScoreServiceV2;
import com.callor.apps.service.ScoreServiceV5;

/*
 * 객체 == 변수
 * 객체와 변수는 선언, 생성, 사용방법이 매우 유사하다
 * 객체만들어진다 
 * 		== 기억장치 어딘가에 저장소가 만들어진다
 * 		== 마치 변수처럼
 * 객체 연결 연산자(점 연산자)가 있다
 * 객체 자체만으로는 어떤 역할을 수행하지 않는다
 * 	다만, method에 매개변수로 전달할때는 거의 변수와
 * 	같이 사용이 된다.
 */
public class ScoreEx_04 {
	
	public static void main(String[] args) {
		
		// 객체 이름짓기
		// 클래스 이름의 첫글자를 소문자로 하여 그대로 사용
		ScoreVO scoreVO = new ScoreVO();
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5(6);
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
		ScoreServiceV2 sServiceV2 = new ScoreServiceV2();
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		Random rnd = new Random();
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		
		/*
		 * 기본 변수 선언 키워드(primitive varriable key word)
		 * int, long, double, float, boolean, char
		 * 
		 * 기본 변수와 사용법이 같은 클래스
		 * wrapper class 
		 * 	: 기본 변수를 감싸고 기능을 확장한다 라는 뜻
		 * Integer, Long, Double, Float, Boolea, Character
		 * 
		 */
		int num = 30;
		Integer num1 = 30;
		float f1 = num1.floatValue();
		
		float numF = (float)num;
		Float numF1 = (float)num;
		
		long longF = 0L;
		Long longF1 = 0L;
		
		double douN = 0;
		Double douN1 = 0.0;
		
		boolean bYes = true;
		Boolean bYesB = true;
		
		char char1 = 'A';
		Character char2 = 'B';
		
		String str1 = "대한민국";
		
		Integer numInt = 30;
		String str2 = numInt.toString();
		str2 = numInt + "";
		
		str2 = "10";
		str1 = "9";
		
		System.out.println(str1 + str2);
		
		Integer n1 = Integer.valueOf(str1);
		Integer n2 = Integer.valueOf(str2);
		System.out.println(n1 + n2);
		
		Float fn1 = Float.valueOf(str1);
		Float fn2 = Float.valueOf(str2);
		System.out.println(fn1 + fn2);
		
		fn1 = Float.valueOf(n1);
		n1 = Integer.valueOf(str2);
		
		str1 = "대한민국";
		System.out.println( str1.length() );
		
		// "" 묶인 문자열은 그 자체로 문자열형 객체가 된다
		System.out.println( "우리나라만세".length() );
		String strNation = new String("우리나라만세");
		
		System.out.println(strNation.length());
		
		// method를 호출하여 return한 결과를
		// 또다른 method에 매개변수로 전달하는 코드의 예
		System.out.println(
				Arrays.toString(
						"Republic of Korea".split(" ")
				)
		);
		System.out.println(
				Integer.valueOf("30") 
					+ Integer.valueOf("40")
		);
	}
}
