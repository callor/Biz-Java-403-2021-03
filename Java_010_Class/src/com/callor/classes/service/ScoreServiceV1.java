package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

public class ScoreServiceV1 {
	
	Scanner scan;
	List<ScoreVO> scoreList;
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	public Integer inputScore() {
		
		// System.out.println("학번을 001 형식으로 입력하세요");
		// System.out.print(">> ");
		// String strNum = scan.next();
		
		/*
		 * scoreList의 데이터 개수를 계산하여
		 * 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		
		int intKor = 0;
		while(true) {
			System.out.println(strNum 
					+ " 번의 국어점수를 입력하세요(중단:-1)");
			System.out.print(">> ");
			intKor = scan.nextInt();
			if(intKor == -1) {
				return -1;
			} else if (intKor < 0 || intKor > 100) {
				System.out.println("국어점수는 0 ~ 100까지!!");
				continue;
			}
			break;
		}
		
		System.out.println(strNum
				+ " 번의 영어점수를 입력하세요");
		System.out.print(">> ");
		int intEng = scan.nextInt();
		
		System.out.println(strNum
				+ " 번의 수학점수를 입력하세요");
		int intMath = scan.nextInt();
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO);
		
		return 0;
		
	} // inputScore()
	
	public void printScore() {

		this.printHeader();
		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			// scoreList의 i 번째 저장된 값을 읽어서
			// ScoreVO 형 sVO 객체에 담기 
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor + "\t");
			System.out.print(sVO.eng + "\t");
			System.out.print(sVO.math + "\n");
		}
		
		
	} // printScore()
	
	private void printHeader() {
		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(Lines.sLine(50));
	}
	

}
