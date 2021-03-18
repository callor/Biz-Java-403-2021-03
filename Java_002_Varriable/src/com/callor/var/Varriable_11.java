package com.callor.var;

public class Varriable_11 {

	public static void main(String[] args) {
		
		int intNum = 100000; // 100001 ~
		// intNum에 담긴 값을 1 증가시키고
		// 출력하라
		System.out.println(++intNum);
		System.out.println(++intNum);
		
		int intSum = 0; // 결과를 저장할 변수를 생성
		intNum = 1; // 시작값을 1로
		System.out.println("================");
		System.out.printf("intNum : %d, intSum : %d\n",
						intNum, intSum);
		
		// intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n",
				++intNum, intSum);
		
		// intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n",
				++intNum, intSum);

		System.out.printf("intNum : %d, intSum : %d\n",
				++intNum, intSum += intNum);
		
		intNum = intNum + 1;
		intSum = intSum + intNum;
		System.out.printf("intNum : %d, intSum : %d",
					intNum, intSum);
		
		
		

	}
	
}
