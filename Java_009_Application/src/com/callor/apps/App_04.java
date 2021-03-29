package com.callor.apps;

import com.callor.apps.service.ScoreServiceV4;

public class App_04 {
	
	public static void main(String[] args) {
		ScoreServiceV4 ssV4 = new ScoreServiceV4(5);
		ssV4.makeScores();
	}
}
