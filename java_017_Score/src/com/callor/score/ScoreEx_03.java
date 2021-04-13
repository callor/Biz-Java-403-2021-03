package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV3;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV3();
		sService.selectMenu();
		
		
	}

}
