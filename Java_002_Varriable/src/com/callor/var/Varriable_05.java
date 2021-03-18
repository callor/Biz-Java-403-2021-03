package com.callor.var;

public class Varriable_05 {

	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; // 1
		
		intNum ++; // 2
		intSum += intNum; // intSum = 1 + 2

		intNum ++; // 3
		intSum += intNum; // intSum = 3 + 3

		intNum ++; // 4
		intSum += intNum; // intSum = 6 + 4

		intNum ++; // 5
		intSum += intNum; // intSum = 10 + 5
		
		System.out.println(intSum);

		
	}
	
}
