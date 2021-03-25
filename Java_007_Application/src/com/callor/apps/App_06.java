package com.callor.apps;

import com.callor.apps.service.EvenServiceV2;

public class App_06 {
	
	public static void main(String[] args) {
		
		EvenServiceV2 esV2 = new EvenServiceV2();
		esV2.makeNums();
		esV2.printEven();
		esV2.sumEven();
		
	}

}
