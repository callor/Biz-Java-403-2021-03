package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor1 = rnd.nextInt(100)+1;
		int intKor2 = rnd.nextInt(100)+1;
		int intKor3 = rnd.nextInt(100)+1;
		int intKor4 = rnd.nextInt(100)+1;
		int intKor5 = rnd.nextInt(100)+1;
		
		for(int i = 0 ; i < 5 ; i++) {
			int num = i + 1;
			
			/*
			 * num 변수하고
			 * intKor 이름하고 합하여 
			 * 		intKor1 ~ intKor5 처럼
			 * 		만들수 있을거 같은데 안된다.!!
			 * intKornum 이라고 작성하면 java는
			 * intKornum라는 변수를 찾으려고 시도한다
			 */
			// intKornum = rnd.nextInt(100) +1;
			// "intKor" + num = rnd.nextInt(100) + 1;
		}
		
		int intSum = 0;
		intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("===============");
		System.out.println("학생1:" + intKor1 );
		System.out.println("학생2:" + intKor2 );
		System.out.println("학생3:" + intKor3 );
		System.out.println("학생4:" + intKor4 );
		System.out.println("학생5:" + intKor5 );
		System.out.println("=================");
		System.out.printf("총점:%d, 평균:%3.2f\n",intSum, floatAvg);
		
		
		
		
	}
	

}
