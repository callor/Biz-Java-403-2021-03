package com.callor.apps;

import com.callor.apps.service.PrimeServiceV2;

public class App_04 {
	
	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		psV2.makeNums();
		psV2.printPrime();
		
	}

}