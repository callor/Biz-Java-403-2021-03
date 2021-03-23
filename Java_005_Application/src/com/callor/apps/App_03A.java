package com.callor.apps;

import java.util.Random;

/*
 * 정수배열 intScores 10개 선언
 * Random 클래스로 50 ~ 100까지 정수를 들어
 * intScores 에 저장
 * 
 * intScores의 점수의 총점, 평균
 */
public class App_03A {

	public static void main(String[] args) {
		
		int[] intScores = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}
		
		int intTotal = 0;
		float floatAvg = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			intTotal += intScores[i];
		}
		// 평균은 전체 총점을 계산 한 후에
		// 한번만 계산을 수행하면 된다
		// 평균을 총점과 같이 for() 반복문에서
		// 계산할 필요는 없다.
		floatAvg = (float) intTotal / 10;
		
		System.out.println("========================");
		System.out.printf("총점 : %d,  평균 : %3.2f\n",
				intTotal, floatAvg);
		System.out.println("========================");
		
		
		
		
		
		
	}
	
	
	
}
