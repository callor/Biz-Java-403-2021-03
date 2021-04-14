package com.callor.score;

import com.callor.score.service.LogService;

public class LogTest_01 {
	
	public static void main(String[] args) {
		
		String strNum = "100";
		String strNum1 = "100A";
		
		try {
			Integer intNum = Integer.valueOf(strNum);
		} catch (NumberFormatException e) {
			LogService.log(strNum + "는 숫자로 변환 불가!!!");
		}
		try {
			Integer intNum1 = Integer.valueOf(strNum1);
		} catch (NumberFormatException e) {
			LogService.log(strNum1 + "는 숫자로 변환 불가!!!");
		}
	}

}
