package com.callor.lam;

import com.callor.lam.service.OnClickService;
import com.callor.lam.service.OnClickServiceImplV1;

public class AppEx_01 {

	public static void main(String[] args) {
		System.out.println("대한민국 만세");
		
		OnClickService on1 = new OnClickServiceImplV1();
		on1.onClick("우리나라만세");
		
		
	}
	
}
