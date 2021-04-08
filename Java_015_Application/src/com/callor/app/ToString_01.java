package com.callor.app;

public class ToString_01 {
	
	public static void main(String[] args) {
	
		Object obj = new Object();
		System.out.println(obj.toString());
		
		Integer num1 = 30;
		System.out.println(num1.toString());
		
		System.out.println(30 + "");
		System.out.println(Integer.toString(30));
		
		int[] nums = new int[2];
		nums[0] = 100;
		nums[1] = 200;
		
		System.out.println(nums.toString());
		
		Integer[] nums1 = new Integer[2];
		nums1[0] = 100;
		nums1[1] = 200;
		System.out.println( nums1.toString() );
		
	}

}
