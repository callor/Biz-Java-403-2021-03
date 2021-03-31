package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm 
			= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm
			= new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘날짜 : %s, 현재시각 : %s",
					curDate,curTime
				);
	}

}
