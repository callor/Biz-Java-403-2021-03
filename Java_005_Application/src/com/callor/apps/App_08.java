package com.callor.apps;

import java.text.DecimalFormat;

public class App_08 {

	public static void main(String[] args) {
		
		int intNum = 3939239;
		DecimalFormat strForm
				= new DecimalFormat("###,###");
		
		// format(숫자) 명령을 수행하면
		// 숫자를 3자리 구분기호를 부착하여
		// 문자열로 만들어 준다.
		String str = strForm.format(intNum);
		System.out.println(str);
		System.out.println(strForm.format(392342340));
		
	}
	
}
