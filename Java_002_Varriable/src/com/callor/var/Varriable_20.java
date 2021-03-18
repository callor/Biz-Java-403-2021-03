package com.callor.var;

public class Varriable_20 {
	
	public static void main(String[] args) {
		
		int intKor = 91;
		int intEng = 82;
		
		int intSum = intKor + intEng;
		
		System.out.printf("%d + %d = %d\n",
				intKor, intEng,
				intSum // intKor + intEng
			);
		
		int avg = (intKor + intEng) / 2;
		avg = intSum / 2;
		System.out.println("평균:" + avg);
		
	}

}
