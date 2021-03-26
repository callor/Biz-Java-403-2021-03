package com.callor.apps.service;

public class TimeServiceV2 {
	
	int nums[];
	public TimeServiceV2() {
		nums = new int[8];
	}
	public void makeTimes() {
		for(int i = 0 ; i < nums.length ; i++) {
			int num = i + 2; // 2 ~ ??
			nums[i] = num; // nums[i] = i + 2;
		}
	}
	public void printTimes() {
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println( LinesService.dLines(50) );
			System.out.printf("%d 단 구구단\n",
						nums[i]);
			System.out.println( LinesService.sLines(50) );
			for(int j = 2; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n",
						nums[i], j , nums[i] * j);
			}
		}
	}
}
