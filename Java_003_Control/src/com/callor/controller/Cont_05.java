package com.callor.controller;

public class Cont_05 {
	
	public static void main(String[] args) {
		
		String strName = "";
		strName = "홍길동";
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(strName + ", ");
		}
		System.out.println();
		
		System.out.println("==================");
		String strNames = "";
		for(int i = 0 ; i < 5 ;i++) {
			strNames += strName;
		}
		System.out.println(strNames);
		
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		System.out.println(strNames);
		
		for(int i = 0 ; i <  10 ; i++) {
			System.out.println(strNames);
		}
		
	}

}
