package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		
		// ScoreServiceV2 클래스의 intValue() method 호출
		ssV2.intValue();
		
		// ScoreServiceV2 클래스의 makeScore() method 호출
		ssV2.makeScore();
		
		// ScoreSerivceV2 클래스의 printScore() method 호출
		ssV2.printScore();
		
	}

}
