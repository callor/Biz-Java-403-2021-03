package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV5 {
	
	String[] subject;
	
	/*
	 * 3과목의 점수를 저장할 배열을 
	 * 		10개 만들었다고 가정하자
	 * 
	 * 8번 요소의 배열에 각각 점수를 저장하자
	 * 
	 * intKor[8] = 90;
	 * intEng[8] = 70;
	 * intMath[8] = 66;
 	 * 
	 */
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;
	public ScoreServiceV5( int members ) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"};
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
	
	/*
	 * 현재는 학생수 만큼 모든 과목의 점수 입력을
	 * 끝내야만 다른 업무로 진행이 된다.
	 * 몇명의 학생, 일부과목 점수만 입력마치고
	 * 잠시 업무를 멈추고 싶을때 
	 * 현재 코드는 불가능하다
	 * => 일부만 입력하고 업무를 중단하는 기능을 넣자
	 */
	public void makeScores() {
		
		// 과목의 개수만큼 점수를 담을 임시 배열 선언
		Integer[] scores = new Integer[subject.length];
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d 번 학생의 성적입력\n",i+1);
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = this.inputScore(subject[j]);
				/*
				 * 입력업무중에 -1을 입력했을때는
				 * 입력업무를 중단하고 main() 으로 되돌아가고 싶다
				 * 이때 break를 사용하면 for() 겹쳐있기 때문에
				 * 원하는대로 코드가 작동되지 않는다
				 * 이럴경우 return type이 void이지만
				 * return명령을 실행하여 method코드를 중단할수 있다
				 */
				if(scores[j] == -1) {
					return;
				}
				
			}
			intKor[i] = scores[0];
			intEng[i] = scores[1];
			intMath[i] = scores[2];
		}
	}
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		while(true) {
			System.out.println(sub 
					+ " 점수를 입력하세요(QUIT : -1");
			System.out.print(">> ");
			score = scan.nextInt();
			
			// 점수입력을 하는 중에 -1을 입력하면
			// 입력하는 업무를 중단하자
			if(score == -1) {
				return -1;
			} else if(score < 0 || score > 100) {
				System.out.println(sub + " 점수는 0 ~ 100까지만 입력!!");
				// continue;
				
			// continue 명령을 사용하는 대신
			// else를 사용하여 코드를 작성
			} else {
				break;	
			}
		}
		return score ;
		
	}
	
	
	/*
	 * 프로젝트를 만들고 컴파일을 수행하고
	 * 실행을 했을때
	 * 
	 * 선언한 클래스는 코드만 존재하는 상태가 된다
	 * 이 클래스를 객체로 선언하고, 생성한 후에
	 * 여러가지 method를 호출하여 업무를 수행할 수 있다
	 * 
	 * method나 변수에 static을 부착하면
	 * 사용하지 않아도 method코드나, 변수가
	 * 메모리에 상주하게 된다.
	 */
	public static String dLine() {
		return "======================================";
	}
	
	

}
