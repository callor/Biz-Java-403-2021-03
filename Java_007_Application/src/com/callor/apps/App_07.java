package com.callor.apps;

import com.callor.apps.service.EvenServiceV3;

public class App_07 {
	
	public static void main(String[] args) {
		EvenServiceV3 esV3 = new EvenServiceV3();
		esV3.makeNums();
		esV3.printEven();
		esV3.sumEven();
	}
}



