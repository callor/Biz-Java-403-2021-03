package com.callor.apps;

import com.callor.apps.service.ScoreService;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		/*
		 * ScoreService 클래스를 사용하여
		 * sService 인스턴스(변수)를 생성한다
		 */
		ScoreService sService = new ScoreService();
		sService.makeScore();
		sService.printScore();
		
		// object(객체) 변수 선언만 하기
		// 아직 사용할 준비가 안된 상태
		// 예약만 되어 있는 상태
		ScoreService sService1 = null;

		// 인스턴스(변수) 생성하기
		// 변수를 초기화 하기
		sService1 = new ScoreService();
		
		String str = null;
		str = new String();
		
		
		
	}

}
