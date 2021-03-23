package com.callor.apps;

public class App_07 {
	/*
	 * 어떤 정수의 단위 자릿수가 얼마인가를
	 * 계산하는 코드
	 */
	public static void main(String[] args) {
		
		int intNum = 93929323;
		int nCount = 0;
		System.out.printf("정수 %d는 ", intNum);
		while(intNum > 0) {
			nCount++;
			intNum /= 10;
		}
		System.out.printf("%d 자릿수의 숫자", nCount);
	}
	

}
