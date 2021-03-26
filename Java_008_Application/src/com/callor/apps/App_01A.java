package com.callor.apps;

import com.callor.apps.service.TimeServiceV1A;

public class App_01A {

	public static void main(String[] args) {
		
		TimeServiceV1A tsV1 = new TimeServiceV1A();
		tsV1.makeTimes();
		tsV1.printTimes();
		
	}
	
}
