package com.callor.apps;

import com.callor.apps.service.EvenServiceV1;

public class App_05 {
	
	public static void main(String[] args) {
		EvenServiceV1 esV1 = new EvenServiceV1();
		esV1.makeNums();
		esV1.printEven();
		esV1.sumEven();
	}

}
