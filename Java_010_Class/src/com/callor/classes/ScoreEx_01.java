package com.callor.classes;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		for(int i =  0 ; i < 100 ; i++) {
			Integer result = ssV1.inputScore();
			if(result == -1) {
				break;
			}
		}
		ssV1.printScore();
		
	}
}
