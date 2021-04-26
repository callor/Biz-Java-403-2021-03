package com.callor.fine;

public class MainEx_03 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		// 출력결과는 30
		
	}
	
}
