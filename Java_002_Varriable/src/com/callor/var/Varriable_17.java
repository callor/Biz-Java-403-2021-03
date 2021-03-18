package com.callor.var;

public class Varriable_17 {

	public static void main(String[] args) {
		
		/*
		 * 변수를 어떤값으로 시작할까
		 * 변수 (저장된)값이 어떻게 변화될까 
		 */
		int num1 = 0;
		
		num1 = 100;
		System.out.println(num1); // 100
		
		num1 = 200;
		System.out.println(num1); // 200
		
		num1 = 300;
		System.out.println(num1); // 300
		
		
		num1 = 100 * 200;
		System.out.println(num1); // 20000
		
		
		num1++; // 1증가
		++num1; // 1증가
		System.out.println(num1); // 20002
		
		num1 += 50; // 20002 + 50더한값이 num1저장
		System.out.println(num1) ; // 20052
		
		int num2 = 3;
		
		// 1. num2 += 10 : num2 == 13 저장
		// 2. num1에 13을 저장하라
		num1 = (num2 += 10); 
		System.out.println(num1); // 13
	}
}
