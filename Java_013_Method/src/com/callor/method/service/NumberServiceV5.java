package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {
	
	public Integer inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.println("QUIT : 입력취소");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intInput = null;
			
			if(strInput.equals("QUIT")) {
				return null;
			} else {
				try {
					intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("정수 또는 QUIT만 입력하세요");
					continue;
				}
			}
			if(intInput < 0) {
				System.out.println("입력값 범위 초과");
				continue;
			}
			return intInput;
		}
	}

}
