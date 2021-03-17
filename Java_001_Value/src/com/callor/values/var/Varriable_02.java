package com.callor.values.var;

public class Varriable_02 {
	
	public static void main(String[] args) {
		/*
		 * 변수의 선언
		 * 변수는 사용(저장, 읽기)하기 전에
		 * 반드시 선언을 해야 한다.
		 * 
		 * 선언키워드 변수명;
		 * 
		 * 어떤 기억장소에 값을 저장할 수 있도록
		 * 에약하는 절차
		 */
		int numbers;
		
		/*
		 * 이미 선언된 변수이름은 같은 이름으로
		 * 또다시 선언할 수 없다.
		 */
		// int numbers;
		
		// int == Integer == 정수
		int num1 = 150;
		int num2 = 250;
		
		// int num1 = 1000;
		
		num1 = 300;
		num2 = 400;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
}
