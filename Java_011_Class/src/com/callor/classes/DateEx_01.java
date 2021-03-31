package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {

		// 컴퓨터의 내장된 시계로 부터
		// 현재 날짜 시간 데이터를 읽어서와서
		// today 객체로 만들기
		Date today = new Date();
		
		// today 객체를 문자열로 변환시키기 위한
		// 보조 클래스
		SimpleDateFormat dateForm 
		= new SimpleDateFormat("yyyy-MM-dd");
		
		String curDate = dateForm.format(today);
		System.out.println(curDate);
		
		SimpleDateFormat timeForm
		= new SimpleDateFormat("hh:mm:ss");
		
		String curTime = timeForm.format(today);
		System.out.println(curTime);
		
		timeForm = new SimpleDateFormat("HH:mm:ss");
		System.out.println(timeForm.format(today));
		
	}
	
}
