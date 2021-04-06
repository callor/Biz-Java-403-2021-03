package com.callor.method.service;

public class NumberServiceV7 {
	
	InputService inService;
	public NumberServiceV7() {
		inService = new InputService();
	}
	
	public void inputNum() {
	
		Integer intKor = null;
		while(true) {
			intKor = inService.inputValue("국어");
			if(intKor == null) {
				return;
			} else if(intKor < 0 || intKor > 100) {
				System.out.println("점수는 0 ~ 100");
				continue;
			}
			break;
		}

		
		
	}
	

}
