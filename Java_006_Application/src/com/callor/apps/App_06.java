package com.callor.apps;

public class App_06 {
	
	public static void main(String[] args) {

		// for() 중첩하기
		// 바깥 for(int i) 가 한번 반복할때 마다
		// 안쪽 for(int j) 가 5번 반복하라
		int nCount = 0;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println(++nCount);
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===================");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===================");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i ; j < 5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	
	}

}
