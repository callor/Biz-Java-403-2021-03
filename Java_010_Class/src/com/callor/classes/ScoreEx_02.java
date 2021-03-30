package com.callor.classes;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		for(int i = 0 ; i < 100 ; i++) {
			if(ssV2.inputScore() == null) {
				break;
			}
		}
		ssV2.printScore();
	}
}
