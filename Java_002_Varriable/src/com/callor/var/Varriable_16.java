package com.callor.var;

/*
 * 클래스명은 첫글자 대문자
 * 변수명은 첫글자 소문자
 */
public class Varriable_16 {
	/*
	 * intDan, intNum 변수를 선언하고
	 * 3단 구구단을 출력
	 */
	public static void main(String[] args) {
		
		// 3단을 표시하기 위한 변수
		int intDan = 3;
		// 2 ~ 9까지의 숫자를 만들고
		// 실제 구구단을 계산하고 출력하기 위한 변수
		int intNum = 1;
		
		// 단 * 숫자 = 결과
		System.out.printf("%d x %d = %d\n",
						intDan,++intNum, 
						intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);
		System.out.printf("%d x %d = %d\n",
				intDan,++intNum, 
				intDan*intNum);

		
		
	}
	
	
	
}
