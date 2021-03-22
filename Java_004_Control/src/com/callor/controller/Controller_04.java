package com.callor.controller;

/*
 * 1 ~ 100까지 숫자중에서
 * 3의 배수의 합
 * 4의 배수의 합
 * 3의 배수이면서 5의 배수의 합
 */
public class Controller_04 {
	
	public static void main(String[] args) {
		
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			if(num % 3 == 0) {
				intSum3 += num;
			}
			if(num % 4 == 0) {
				intSum4 += num;
			}
			if(num%3==0 && num%5==0) {
				intSum5 += num;
			}
		}
		
	}
	

}
