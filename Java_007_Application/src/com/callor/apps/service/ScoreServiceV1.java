package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	int[] intKor = new int[5];
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	public ScoreServiceV1() {
		intKor = new int[10];
		intEng= new int[ intKor.length ];
		intMath = new int[ intKor.length ];
		
		intTotal = new int[ intKor.length ];
		floatAvg = new float[ intKor.length ];
	}
	
	public void makeScore() {
		Random rnd = new Random();
		for(int i = 0 ; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
		}
	}
	public void makeSum() {
		for(int i = 0 ; i < intKor.length ; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
		}
	}
	
	public void printScore() {
		System.out.println("============================");
		System.out.println("빛나라 고교 성적리스트");
		System.out.println("----------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------");
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("==========================");
	}
	

}
