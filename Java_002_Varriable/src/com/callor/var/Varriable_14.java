package com.callor.var;

public class Varriable_14 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 7;
		
		intSum += (intNum += 2);
		intSum += (intNum += 5);
		intSum += (intNum += 2);
		System.out.printf("Sum : %d, Num : %d",
				intSum, intNum);
		
		
		
	}
	
}
