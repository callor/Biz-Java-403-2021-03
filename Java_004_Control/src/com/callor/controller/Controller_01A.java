package com.callor.controller;

public class Controller_01A {

	public static void main(String[] args) {
		

		
		// 1. 0 ~ 99 + 1 => 1 ~ 100
		for(int index = 0 ; index < 100 ; index++) {
			
			//1-1. 1 ~ 100
			int num = index + 1;
			
			// 3의배수 이거나, 4의 배수인 수들을 보여라
			//2. 3의 배수이면
			if(num % 3 == 0) {
				System.out.print(num);
			}
			//3. 4의 배수이면
			if(num % 4 == 0) {
				System.out.println(num);
			}
		}
		
		// 3의 배수의 합, 4의 배수의 합
		// 합의 구하기위해
		// 변수를 선언을 한다
		int intSum3 = 0;
		int intSum4 = 0;
		
		int intSum5 = 0;
		
		for(int index = 0 ; index < 20; index++) {
			int num = index + 1;
			
			// num값이 3의 배수이면
			// num값을 intSum3변수에 누적하라
			// 누적하라 : intSum3 변수에 담긴값과
			//		num값(새로운값)을 덧셈하여
			//		다시 intSum3 변수에 저장하라
			if(num % 3 == 0) {
				intSum3 += num;
			} 
			
			/*
			 * 여기에서 else if를 사용하면
			 * 3의 배수이면서 4의 배수인 경우
			 * 3의 배수에는 합산(누적)이 되지만
			 * 4의 배수에는 누락이 된다.
			 */
			
			if(num % 4 == 0) {
				intSum4 += num;
			}
			
			
			/*
			 * 3의 배수이면서 5의 배수
			 * num % 3 == 0 AND num % 5 == 0
			 */
			if(num % 3 == 0) {
				if(num % 5 == 0) {
					intSum5 += num;
				}
			}
		}
		
		System.out.println("===============");
		System.out.printf("3의 배수 : %d\n",intSum3);
		System.out.printf("4의 배수 : %d\n",intSum4);
		System.out.printf("3 AND 5의 배수 : %d\n",intSum5);
		System.out.println("===============");
		
	}
	
	
}
