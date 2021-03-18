package com.callor.var;

public class Varriable_13 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		int intSum = 0;
		
		// 1. intNum변수에 2를 추가하라
		//		intNum == 2
		// 2. intSum에 intNum변수에 저장된 값을
		//		읽어서 추가하라
		//		intSum = 2
		intSum += (intNum += 2);
		System.out.println(intSum);
		
		intSum += (intNum += 5);
		// ?? intSum
		
		intSum += (intNum += 2);
		// ?? intSum, ?? intNum 
		
		
	}

}
