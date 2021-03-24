package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 {
	
	// 클래스 영역에 선언된 변수
	// 누군가 이 클래스를 사용하여 인스턴스를 생성하면
	// 자동으로 예약이 되는 변수들
	// 인스턴스(영역) 변수
	// 클래스의 맴버변수
	// 클래스 영역에 선언된 변수는
	// 클래스에 포함된 method에서 변수를 
	//		사용(읽기,쓰기)할 수 있다.
	Random rnd;
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	// 배열과, 인스턴스변수를 생성하는 method
	public void intValue() {
		
		// Random 클래스를 사용하여 
		// rnd 인스턴스(변수) 생성
		rnd = new Random();
		
		intKor = new int[10];
		intEng = new int[ intKor.length ];
		intMath = new int[ intKor.length ] ;
	}
	
	// Random 클래스를 사용하여 점수 생성후 
	// 배열에 저장하는 method
	
	// Random 클래스를 사용하여 생성된 rnd 인스턴스변수의
	// nextInt() method를 호출하여 1 ~ 100까지 난수를 만들고
	// 각각 점수 배열에 저장하기
	public void makeScore() {
		for(int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
	}

	// 점수배열에 담긴 값들을 사용하여
	// 성적리스트 출력하기
	public void printScore() {
		System.out.println("=========================");
		System.out.println("국어\t영어\t수학");
		System.out.println("-------------------------");
		for(int i = 0 ; i < intKor.length ;i++) {
			System.out.printf("%3d\t%3d\t%3d\n",
					intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("=========================");
	}
	
	

}
