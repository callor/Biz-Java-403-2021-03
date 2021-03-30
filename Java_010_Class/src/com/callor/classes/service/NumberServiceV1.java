package com.callor.classes.service;

/*
 * 두 정수의 덧셈, 두 실수의 덧셈
 * 두개의 문자열 연결 수행하는 코드를
 * 클래스를 만들고 분리하여 작성하고 있다.
 * 
 * 이러한 코드를 작성할때
 * 각각의 method이름을 고유하게 작성하여야 했는데
 * 	(구조적, 모듈화 프로그래밍 시절에)
 * 
 * 객체지향 프로그래밍 시절에는 매개변수의 타입을
 * 달리하여 같은 이름을 사용할 수 있다
 */
public class NumberServiceV1 {
	public void intAdd(int num1, int num2) {
		System.out.println("두 정수의 덧셈");
		System.out.println(num1 + num2);
	}
	public void floatAdd(float num1, float num2) {
		System.out.println("두 실수의 덧셈");
		System.out.println(num1 + num2);
	}
	public void stringAdd(String str1, String str2) {
		System.out.println("두 문자열의 연결");
		System.out.println(str1 + str2);
	}
	
	/*
	 * 객체지향 프로그래밍에서는
	 * 한 클래스내에서 같은 이름의 method를
	 * 중복 선언하여 작성할 수 있다
	 * 단, 
	 * 		매개변수의 개수를 달리하거나
	 * 		매개변수의 type을 달리하거나 
	 * 			하는 방식으로
	 * 		method를 선언해야 한다
	 */
	public void add(int num1, int num2) {
		System.out.println("두 정수의 덧셈");
		System.out.println(num1 + num2);
	}
	public void add(float num1, float num2) {
		System.out.println("두 실수의 덧셈");
		System.out.println(num1 + num2);
	}
	public void add(String str1, String str2) {
		System.out.println("두 문자열의 연결");
		System.out.println(str1 + str2);
	}
	
	
}
