package com.callor.controller;

public class Score_05 {
	
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		int intSum = 0;
		float floatAvg = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		floatAvg = (float)intSum / 3;
		
		System.out.printf("총점 : %d, 평균 : %3.2f",
					intSum, floatAvg);
		
	}

}
