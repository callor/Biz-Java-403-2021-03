package com.callor.apps;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		int[] nums = new int[10];

		nums[0] = 33;
		nums[1] = 33;
		nums[2] = 33;
		nums[3] = 33;
		nums[4] = 33;

		Scanner scan = new Scanner(System.in);
		
		int[] intKors = new int[5];
		int[] intEngs =new int[5];
		int[] intMaths = new int[5];
		int intMath = 0;
		int[] intSum = new int[5];
		
		intKors[0] = scan.nextInt(); 
		intKors[1] = scan.nextInt();
		intKors[2] = scan.nextInt();
		intKors[3] = scan.nextInt();
		intKors[4] = scan.nextInt();

		int num = 100;
		int num2 = num + 1;
		
		// 0,1,2,3,4
		for(int i = 0 ; i < intKors.length ; i++) {
			intKors[i] = scan.nextInt();
		}
		for(int i = 0 ; i < intEngs.length ; i++) {
			intEngs[i] = scan.nextInt();	
		}
		for(int i = 0 ; i < intMaths.length ; i++) {
			intMaths[i] = scan.nextInt();	
		}

		// 88
		// 99 
		// 100
		// 99
		// 77
		for(int i = 0 ; i < intKors.length ; i++) {
			System.out.println(intKors[i]);
		}
		// System.out.println(intKors[1]);
		
		for(int i = 0 ; i < intKors.length ; i++) {
			intSum[i] = intKors[i] + intEngs[i];
			// intSum[1] = intKors[0] + intEngs[2];
		}
	}

}
