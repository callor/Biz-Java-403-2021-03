package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A {

	// 클래스 영역에 Scanner 클래스를 사용하여
	// scan 객체를 선언
	// NullPointerException
	// JDK 또는 여러가지 클래스를 가져와 사용하는 경우
	// 매우 자주 맞나는 Exception
	// 클래스를 사용하여 객체를 "선언만" 아직 사용할 준비가
	// 되어있지 않다
	// 사용할 준비가 되어있지 않다 == 생성, 초기화 가 안되었다
	Scanner scan;

	// 학생 만큼 과목점수를 저장할 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;

	// Service클래스에서 배열의 개수를 고정하지 말고
	// 최초로 객체를 생성할때 필요한 개수를
	// 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을
	// 사용하여 배열을 만들자
	public ScoreServiceV1A(int members) {
		// scan 객체를 생성(초기화)하기
		// 객체를 선언하고 생성하는 코드가 없으면
		// 사용하는 과정에서 NullpointerException이 
		// 발생한다
		scan = new Scanner(System.in);
		
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	
	}
	
	public void makeScores() {
		// 무한 반복문을 사용하여
		// 국어점수가 0 ~ 100범위를 벗어나면
		// 메시지를 보여주고 다시 점수를 입력받도록 한다
		// 만약 정상적인 범위(0 ~ 100)를 입력하면
		// 반복문을 종료하고, 다음 코드가 실행되도록 한다
		while(true) {
			System.out.println("국어점수를 입력하세요( 0 ~ 100 )");
			System.out.print(">> ");
			int score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100까지 만 입력하세요");
			} else {
				break;
			}
		}
		
	}

	// public : 전체, 공용, 모두, 누구나
	// 	객체.addNum() 형식으로 method를 호출하여
	// 	명령을 실행할수 있도록 하는 Keyword
	public void addNum() {
		this.inputScore();
		
		
		// 현재 method코드의 끝이다 라는 선언
		// method 선언 키워드가 void 이면
		// return 명령을 생략할 수 있다.
		return;
	}
	
	// private : 개인적인, 현재 클래스에서만
	//	method를 호출하여
	//	명령을 실행할수 있도록 하는 Keyword
	//	객체.inputScore() 형식으로 사용 불가
	//  외부에 공개하지 않고, 현재클래스의 코드에서만
	//	호출할수 있도록 제한하는 keyword
	
	// Integer : void keyword 대신 정수를 선언하는
	// 	키워드를 사용하여 method 선언하기
	//	method 코드 끝에 반드시 
	//	return 명령문이 있어야 한다
	
	// 여기에서 사용된 Integer 키워드는
	//	변수를 선언하는 용도의 키워드가 아니고
	//	return type 키워드라고 한다.
	//  method의 코드내에 "return 값;" 형식의
	//  코드가 반드시 있어야 함을 선언하는 것
	
	// return type이 void 형(type)일 경우는
	//	return 명령문이 생략되거나
	//	return 명령문만 단독으로 사용할수 있다
	
	// return type이 void 형이 아닌경우
	// 	return 명령문은 반드시 코드내에 적절한 위치에
	// 	있어야 하고
	//	return 값 형식으로 사용해야 한다.
	private Integer inputScore() {
		return 0;
	}
	
	public String names() {
		return "";
	}
	public int add() {
		return 0;
	}
	public float addFloat() {
		return 0.0f;
	}
	public long addLong() {
		return 0;
	}
	public boolean yesNo() {
		return false;
	}
	public boolean noYes() {
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	

}
