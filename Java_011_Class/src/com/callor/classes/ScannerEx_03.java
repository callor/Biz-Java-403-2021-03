package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_03 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Scanner의 nextInt() method의 문제를 해결하기 위해
		 * 1. 숫자입력을 문자열형으로 입력받는다
		 * 2. 문자열형 숫자를 숫자형으로 변환한다
		 * 3. 4칙 연산을 수행한다.
		 */
		System.out.println("두개의 숫자를 입력");
		System.out.print("숫자 1 >> ");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("숫자 2 >>");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		System.out.printf("%d + %d = %d\n",
				intNum1, intNum2, intNum1 + intNum2);
		System.out.printf("%d x %d = %d\n",
				intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d - %d = %d\n",
				intNum1, intNum2, intNum1 - intNum2);
		System.out.printf("%d / %d = %d\n",
				intNum1, intNum2, intNum1 / intNum2);
	}
	

}
