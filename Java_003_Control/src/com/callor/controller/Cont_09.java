package com.callor.controller;

public class Cont_09 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			boolean bYes = i % 2 == 0;
			if( bYes ) {
				System.out.println(i + "는 짝수");
			} else {
				System.out.println(i +"는 짝수가 아님");
			}
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			
			boolean bYes = i % 3 == 0;
			if( bYes ) {
				System.out.println(i +"는 3의 배수");
			} else {
				System.out.println(i + "는 3의 배수가 아님");
			}
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			if( i % 3 == 0 ) {
				System.out.println(i + "는 3의 배수");
			} else {
				System.out.println(i + "는 3의 배수가 아님");
			}
		}
	}
}
