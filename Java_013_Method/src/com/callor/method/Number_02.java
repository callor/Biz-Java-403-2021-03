package com.callor.method;

public class Number_02 {
	
	public static void main(String[] args) {
		
		String strNum1 = "100";
		String strNum2 = "100.0";
		
		int intNum1 = Integer.parseInt(strNum1);
		float floatNum2 = Float.parseFloat(strNum2);
		
		/*
		 * 데이터를 단독으로 처리할때는 큰 문제가 없는데
		 * 파일에 저장, 파일에서 읽기
		 * 네트워크(인터넷)등을 통하여 전송(공유) 등으로
		 * 	데이터가 컴퓨터와 컴퓨터간에 이동할때
		 * 데이터를 효츌적이고, 오류가 나지 않도록
		 * 	이동하는 다양한 방법이 있다
		 * 여러가지 방법이 취하는 많은 공통된 부분에
		 * 	모든 데이터를 문자열화 하여 전송하는 방법이 있다
		 * 숫자, 문자, 특수기호 등을 모두 문자열(ASCII 코드)로
		 * 	전송하고, 받는 곳에서 사용하기 전에 적절한
		 * 	type으로 변경하여 사용한다
		 * 
		 * Java에서는 WrapperClass.parse*() mehtod나
		 * 	WrapperClass.ValueOf() method를 사용하여
		 * 	문자열형 숫자를 숫자 값으로 변환시키는 것을
		 * 	지원한다.
		 * 
		 * 	이 과정에서 숫자값으로 변환할수 없는 문자열이
		 * 	섞여 있는 경우 NumberFormatException이 발생할수
		 * 	있다.
		 */
		intNum1 = Integer.valueOf("100");
		intNum1 = Integer.valueOf( 30 + ""); // "30"
		intNum1 = Integer.valueOf("" + 30);
		
		// NumberFormatException 이 발생하는 코드들
		intNum1 = Integer.valueOf(100 + " ");
		intNum1 = Integer.valueOf("100 ");
		
		intNum1 = Integer.valueOf(" 100");
		intNum1 = Integer.valueOf("100 00");
		
		intNum1 = Integer.valueOf("A100");
		intNum1 = Integer.valueOf("100A");
		intNum1 = Integer.valueOf("100*");
		intNum1 = Integer.valueOf("100*100");
		
		// "" 은 null 과 유사한 값이다
		// 자바에서는 "" 과 null을 완전히 같은 것으로
		//	취급하지 않는다
		intNum1 = Integer.valueOf("");
		intNum1 = Integer.valueOf(null);
		
		
		
	}
}
