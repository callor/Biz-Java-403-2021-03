package com.callor.apps;

import java.util.Random;

public class PrNames {
	
	public static void main(String[] args) {
		String[] strNames = {
				"홍길동", "이몽룡","성춘향"
		};
		
		Random rnd = new Random();
		for(int i = 0 ; i < 1000 ; i++) {
			
			// 0 ~ 24 중의 수 2개 생성
			// 
			int index1 = rnd.nextInt(strNames.length);
			int index2 = rnd.nextInt(strNames.length);
			
			// 생성된 index1, index2를 가지고
			// 배열의 2값을 서로 교환
			String temp = strNames[index1];
			strNames[index1] = strNames[index2];
			strNames[index2] = temp;
		}
		
		for(int i = 0 ; i < strNames.length ; i++) {
			System.out.print(strNames[i] + "\t");
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
		
	}

}
