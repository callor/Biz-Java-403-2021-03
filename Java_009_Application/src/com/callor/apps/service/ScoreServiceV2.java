package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	
	public void makeScores( ) {
		System.out.println("국어점수입력");
		inputScore();
		
		System.out.println("영어점수입력");
		inputScore();
		
		System.out.println("수학점수입력");
		inputScore();
		
	}
	private Integer inputScore() {
		Integer score = 0;
		while(true) {
			System.out.println("점수를 입력하세요(0~100)");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100까지만 입력해야 합니다");
				continue;
			}
			break;
		}
		return score;
	}
	
	
}
