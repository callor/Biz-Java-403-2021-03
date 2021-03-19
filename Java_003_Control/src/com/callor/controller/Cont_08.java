package com.callor.controller;

public class Cont_08 {
	
	public static void main(String[] args) {
		/*
		 * 임의의 수를 변수에 담고
		 * 2 ~ (임의의 수 - 1) 반복을 하면서
		 * 나머지 연산을 수행해 본다. 
		 * 
		 * 나머지 연산결과가 0 인
		 * 		경우가 있는가 검사하고
		 * 나머지 연산결과가 한번이라도 0인 
		 * 		경우가 있으면
		 * 		그 수는 소수가 아니다 라고 출력한다
		 */
		int intNum = 100;
		for(int i = 2; i < intNum ; i++) {
			boolean bYes = intNum % i == 0;
			if( bYes ) {
				// 만약 반복문이 진행(수행)되는 동안에
				// 나머지가 0인 경우가 나타나면
				// 그 수는 소수가 아니므로
				// "소수가 아님" 메시지를 보여주고
				// for() 반복문을 중단(break)하라 
				System.out.println(intNum + "는 소수가 아님:" + i);
				break;
			}
		}
		
		intNum = 77;
		for(int i = 2 ; i < intNum ; i++) {
			boolean bYes = intNum % i == 0;
			if( bYes ) {
				System.out.println("소수가아님");
				break;
			}
		}
		
	}

}
