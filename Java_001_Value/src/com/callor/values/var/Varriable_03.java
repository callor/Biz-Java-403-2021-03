package com.callor.values.var;

public class Varriable_03 {

	public static void main(String[] args) {
		
		// 정수형(Integer Type) 변수 num1 선언
		// 		정수값을 저장할 기억장소를 예약하고
		// 		num1이름을 부여하기
		int num1;
		// 한번 변수를 선언하는데 사용한 이름으로
		// 또 다시 변수를 선언할 수 없다.

		// 또다른 기억장소를 예약하고 num2 이름 부여
		int num2;
		
		// 선언된 변수에 값을 저장하기
		num1 = 30;
		num2 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// num1변수와 num2변수에 어떤 값이 
		//		저장되어 있는지
		// 		관심없다
		// 모두 제거하고
		// num1에 150을, num2에 250을 저장하라
		num1 = 150;
		num2 = 250;
		
		/*
		 * programming에서 
		 * 		할당연산자(=), 
		 * 		일치(EQ)연산자(==)
		 * 
		 * 할당연산자는 변수에 어떤 값을 저장할때
		 * 		변수 = 값
		 * 		변수 = 연산식
		 * 		변수 = 변수
		 * 
		 * 일치연사는 값이 같은가를 비교할때
		 */
		
		// 이미 저장된 모든 값을 제거하고
		// 30을 저장하라
		num1 = 30; 
		
		// 이미 저장된 모든 값을 제거하고
		// 30 * 40 연산결과를 저장하라
		num1 = 30 * 40;
		num2 = 100;
		// 이미 저장된 모든 값을 제거하고
		// num2 변수에 저장된 값을 복사하여 저장하라
		num1 = num2;
		
		// 변수와 관련된 코드는 
		// 코드의 순서에 주의 해야 한다.
		System.out.println(num1); // 250 출력
		
		num1 = 30 % 2;
		System.out.println(num1);
		
		num1 = 30 * 100;
		
		/*
		 * 선언만 된 변수는
		 * 		int num3;
		 * 현재 그 기억장소에 어떤 값이 보관되어 있는지
		 * 알수가 없다
		 * 따라서 그 변수값을 읽어서 처리하는 코드는
		 * 오류가 발생한다.
		 * 
		 * 변수는 선언할때 반드시 어떤 값을 저장해 
		 * 주는것이 좋다
		 * 
		 * 만약 저장될 값이 아직 정해지지 않았다면
		 * 0을 저장하자
		 */
		// 정수형 값을 저장할 변수 num3를 선언하고
		// 0으로 clear 한다.
		// ==> 변수선언과 초기화 라고 한다.
		// ==> 변수생성 이라고 한다.
		int num3 = 0;
		System.out.println(num3);
		
		int num4;
		num4 = 0;
		System.out.println(num4);
		
		int num5 = 100;
		System.out.println(num5);
		
		int num6;
		num6 = 200;
		System.out.println(num6);
		
		
	}
	
}
