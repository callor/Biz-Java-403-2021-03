package com.callor.var;

public class Varriable_12 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intNum += 100;
		System.out.println(intNum); // 100
		
		intNum += 33;
		System.out.println(intNum); // 133
		
		intSum += intNum;
		System.out.println(intSum); // 133
		
		intSum += intNum; // 133 + 133
		intSum += intNum; // 133 + 133 + 133
		intSum += intNum; // 133 + 133 + 133 + 133
		
		intSum = 0;
		
		// 0 + 1 + 2 + 3 + 4 + 5를 계산하여
		// intSum에 저장하라
		intSum = intSum + 1 + 2 + 3 + 4 + 5;
		
		intSum = 0;
		intSum = intSum + 1;// A
		intSum = intSum + 2;// B
		intSum = intSum + 3;// C
		intSum = intSum + 4;
		intSum = intSum + 5;
		
		intSum = 0;
		intNum = 1;
		intSum = intSum + intNum; // A와 같은코드
		intSum = intSum + (++intNum); //B와...
		intSum = intSum + (++intNum); //C와...
		
		
		
		
		
		
	}
}
