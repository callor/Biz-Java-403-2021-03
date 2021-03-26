package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04A {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("정수 5개를 입력합니다");
		for(int i  = 0 ; i < nums.length ; i++) {
			int num = i + 1;
			System.out.printf("정수 %d번 >> ",num);
			nums[i] = scan.nextInt();
		}
		System.out.println(LinesService.dLines(40));
		System.out.print("입력한 숫자 들 : ");
		System.out.println( Arrays.toString(nums) );
		System.out.println(LinesService.sLines(40));
		
		int intSum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			intSum += nums[i];
		}
		System.out.printf("리스트 합계 : %d\n",intSum);
		System.out.println(LinesService.dLines(40));
	}
}
