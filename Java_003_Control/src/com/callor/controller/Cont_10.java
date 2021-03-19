package com.callor.controller;

public class Cont_10 {
	
	public static void main(String[] args) {
		
		int intNum = 8;
		
		// intNum에 담긴 값이 3의 배수이냐
		if(intNum % 3 == 0) {
			System.out.println(intNum + "는 3의 배수");
		} else if(intNum % 2 == 0) {
			System.out.println(intNum +"는 2의 배수");
		} else if(intNum % 5 == 0) {
			System.out.println(intNum + "는 5의 배수");
		} else {
			System.out.println("3, 2, 5의 배수가 아님");
		}
		
		
		
		
	}

}
