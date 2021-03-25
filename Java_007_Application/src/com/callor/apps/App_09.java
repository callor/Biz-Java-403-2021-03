package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		// public ScoreServiceV1()
		// public ScoreServiceV2( int members )
		ScoreServiceV2 ssV2 = new ScoreServiceV2( 5 );
		ssV2.makeScore();
		ssV2.makeSum();
		ssV2.printScore();

	}
}
