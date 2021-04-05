package com.callor.method;

import com.callor.method.service.NumberServiceV2;

public class Method_05 {
	
	public static void main(String[] args) {
		
		NumberServiceV2 nsV2 = new NumberServiceV2();
		Integer retNum = nsV2.inputNum();
		if(retNum == null) {
			System.out.println("업무종료");
		} else {
			System.out.println("입력된 정수 : " + retNum);
		}
		
	}
}
