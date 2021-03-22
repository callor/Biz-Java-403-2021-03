package com.callor.controller;

import java.util.Random;

public class Controller_13 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();

		/*
		 * intSum변수를 어디에 선언할까?
		 * 짝수들을 어디에서 합산(누적)할까
		 * 어디에서 출력을 할까
		 */
		int intSum = 0;
		for(int i = 0; i < 10 ; i++) {
			int num = rnd.nextInt(100) + 1;
			if(num % 2 == 0) {
				intSum += num;
			}
		}
		System.out.println("==============");
		System.out.println("합계 : " + intSum);
		System.out.println("==============");
	}

}
