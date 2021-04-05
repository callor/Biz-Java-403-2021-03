package com.callor.method;

public class Number_01 {
	
	public static void main(String[] args) {
		
		// 문자열형 숫자
		String strNum1 = "100";
		String strNum2 = "100.0";
		
		// 문자열 연결연산
		System.out.println(strNum1 + strNum2);
		
		// strNum1과 strNum2에 저장된 값으로
		// 4칙연산을 표현하고 싶다
		// 4칙연산이 가능한 type으로 변환을 시켜야 한다.
		
		/*
		 * Integer 클래스에 정의된 valueOf() static method를
		 * 호출하여 문자열형 숫자를 정수형 값으로 변환하고
		 * intNum 변수에 저장하라
		 * 
		 * static method는 클래스를 객체로 생성하지 않고도
		 * 호출할수 있다
		 * 단, 함수방식으로 호출이 불가
		 * 		클래스.method() 형식으로 호출해야 한다
		 */
		Integer intNum = Integer.valueOf(strNum1);
		Float floatNum = Float.valueOf(strNum2);
		
		System.out.printf("%d + %f = %f\n",
					intNum,floatNum, intNum + floatNum
			);
		System.out.printf("%d - %f = %f\n",
				intNum,floatNum, intNum - floatNum
			);
		System.out.printf("%d x %f = %f\n",
				intNum,floatNum, intNum * floatNum
			);
		System.out.printf("%d / %f = %f\n",
				intNum,floatNum, intNum / floatNum
			);
		
		
		
		
		
		
	}
	

}
