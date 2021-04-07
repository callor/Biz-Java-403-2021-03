package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.InputServiceV2;

public class NumberEx_03 {
	
	public static void main(String[] args) {
		InputServiceV2 inService = new InputServiceV2();
		// inService.inputValue("새우깡");
		// inService.inputValue("새우깡",0,1000);
		inService.inputValue("새우깡",100);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		// scan.close();
		
	}

}
