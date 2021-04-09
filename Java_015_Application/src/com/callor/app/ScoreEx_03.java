package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceV2;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceV2();
		sService.selectMenu();
		
	}

}
