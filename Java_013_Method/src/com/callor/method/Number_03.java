package com.callor.method;

import java.util.Scanner;

public class Number_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		System.out.println("QUIT 는 종료하기");
		System.out.print(">> ");
		String strInput = scan.nextLine();
		
		// trim() : 문자열의 앞, 뒤에 붙은 white space를
		// 제거하는 method
		
		strInput = strInput.trim();
		strInput.equals("QUIT");

		// 입력된 문자열에 혹시 있을지 모를 whiteSpace를
		// 제거하고 입력문자열이 QUIT인가를 검사하는 코드
		// 객체의 chainnig 
		if(strInput.trim().equals("QUIT")) {
			System.out.println("종료합니다");
		} else {
			
			/*
			 * 예외처리
			 * 	Integer.valueOf(문자열) 코드가 실행되는 동안
			 * 		NumberFormatException이 발생하면
			 * 		코드가 중단되는데
			 * 	코드를 중단하지 않고, 
			 * 		사용자에게 메시지등을 전달하고
			 * 		적절한 연산코드를 추가하여
			 * 		코드를 계속 진행하도록 하는 조치
			 * 
			 * 예외처리 코드는
			 * 		개발자에게는 상당히 불필요한 코드를
			 * 		추가하여 부담을 주는 것일수 있다
			 * 	하지만, 적절한 예외처리를 해준 코드는
			 * 		End User(실제 사용자)에게
			 * 		불편함을 최소한으로 주는 적절한 방법이다
			 * 
			 * End User에게 좋은 코드를 작성하는 개발자는
			 * 	결국 좋은 개발자가 된다.
			 */
			try {
				int intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("숫자가 아닌 값을 입력하였음");
				System.out.println("숫자로 변환하는 동안 오류");
			}
		}
	}

}
