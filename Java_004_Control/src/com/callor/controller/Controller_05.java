package com.callor.controller;

public class Controller_05 {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
				
		boolean bYes = num1 % 3 == 0
				&& num2++ % 4 == 0;
		
		bYes = num1 % 3 == 0 
				&& (++num2) % 3 == 0;
		
		/*
		 * &&(AND) 연산의 경우 
		 * 왼쪽에서 오른쪽으로 코드 실행이 진행되면서
		 * 한번이라도 false 결과가 나오면
		 * 그 이후 코드는 연산수행을 하지 않는다
		 */
		bYes = num1 > 4 && ++num2 > 5;
		
		// num2의 값 == 6
		
		/*
		 *  ||(OR) 연산의 경우
		 *  왼쪽에서 오른쪽으로 코드 실행이 진행되면서
		 *  한번이라도 true인 결과가 나타나면
		 *  그 이후 코드는 연산수행을 하지 않는다
		 */
		bYes = num1 < 4 || ++num2 < 5;

		/*
		 * 선행되는 코드에서 결과가
		 * 뚜렷하여 이후 코드가 실행될 
		 * 필요가 없으면 코드 실행을 멈추는 기능
		 * 
		 * 이러한 기능때문에
		 * 가끔 ++ 연산, +=(*=,-=...) 연산에서
		 * 원하는 결과가 이후에 반영이
		 * 안되는 경우가 있기 때문에
		 * 사용하는데 상당히 주의를 기울여야 한다
		 */
		
		
		
	}
	
}
