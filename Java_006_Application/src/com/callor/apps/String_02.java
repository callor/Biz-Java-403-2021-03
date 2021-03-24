package com.callor.apps;

import com.callor.apps.service.LinesService;

public class String_02 {
	
	public static void main(String[] args) {
		
		String strName = "홍길동:이몽룡:성춘향";
		// strName에 담긴 문자열을
		// 콜론(:)을 기준으로 잘라 
		// strNames배열에 저장하기
		String[] strNames = strName.split(":");
		
		System.out.println(LinesService.dLine);
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println(LinesService.sLine);
		for(int i = 0 ; i < strNames.length ; i++) {
			System.out.println(strNames[i]);
		}
		System.out.println(LinesService.dLine);
		
		
		
	}
	

}
