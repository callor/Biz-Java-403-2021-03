package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {
	
	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;
	
	InputServiceV2 inService;
	String[] subject;
	
	public ScoreServiceV5A() {
		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();
		inService = new InputServiceV2();
		subject = new String[]{"국어","영어","수학"};
	}
	
	public void inputScore() {
		for(int st = 0 ; st < 5 ; st++) {
			Integer[] scores = new Integer[ subject.length ];
			for(int sb = 0 ; sb < subject.length ; sb++) {
				scores[sb] = inService.inputValue(subject[sb], 0, 100);
			}
			// scores에는 한 학생의 국어,영어,수학 점수가
			//	저장되어 있다
			korList.add(scores[0]);
			engList.add(scores[1]);
			mathList.add(scores[2]);
		}
	}
	
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int index = 0 ; index < korList.size() ; index++) {
			System.out.print(korList.get(index) + "\t");
			System.out.print(engList.get(index) + "\t");
			System.out.print(mathList.get(index) + "\n");
		}
		System.out.println("=".repeat(50));
	}
	
	public void inputScore1() {
		
		for(int i = 0 ; i < 5 ; i++) {
			Integer score = inService.inputValue(subject[i],0,100);
			if(score == null) {
				return;
			} else {
				if(i == 0) {
					korList.add(score);
				} else if(i == 1) {
					engList.add(score);
				} else if(i == 2){
					mathList.add(score);
				} else if(i == 3 ) {
				}
			}
		}
	}
	
	public void inputScore2() {
		
		for(int i = 0 ; i < 5 ; i++) {
			Integer score = inService.inputValue(subject[i],0,100);
			if(score == null) {
				return;
			} else if(subject[i].equals("국어")) {
				korList.add(score);
			} else if(subject[i].equals("영어")) {
				engList.add(score);
			} else if(subject[i].equals("수학")) {
				mathList.add(score);
			} else if(subject[i].equals("음악")) {
				
			}
		}
	}
}
