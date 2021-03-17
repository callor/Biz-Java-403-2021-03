package com.callor.hello;

/*
 * 숫자 연산
 * java에서는 수학의 4칙연산과 나머지 연산을
 * 수행할 수 있다.
 * 
 * 숫자가 정수형 일때는
 * 4칙연산의 결과가 모두 정수이다
 * 
 * 정수 / 정수 연산을 수행했을때
 * 결과는 나눗셈의 몫을 구하는 연산이 된다.
 * 
 * 정수 % 정수 연산을 수행하면
 * 결과는 나머지를 구하는 연산이 된다.
 * 
 */
public class Hello_03 {

	public static void main(String[] args) {
		
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);
		System.out.println(30 / 40);
		System.out.println(30 % 40);
		System.out.println(1 % 2);
		System.out.println(2 % 2);
		System.out.println(3 % 2);
		System.out.println(4 % 2);
		System.out.println(5 % 2);
		
		System.out.println("==================");
		// 40을 30으로 나누면 일반적 수학 연산에서는
		// 소수점 이하 값이 나타나지만
		// java에서 정수 / 정수는 몫을 구하기 때문에
		// 결과는 1만 나타난다
		System.out.println(40 / 30);
		
		// java에서 실수의 표현 1
		// java는 실수를 표현할때 10 -16승까지 표현한다
		// 소수점이하 16자리 까지 표현하고 이후 값은
		// 무시 또는 반올림등을 수행한다
		System.out.println(40.0 / 30.0);
		
		// 정수와 실수의 연산
		// 정수와 실수가 섞여있는 연산 식에서는
		// 모든 숫자를 실수로 변경하여 연산이 수행
		System.out.println(40 / 30.0);
		System.out.println(40.0 / 30);
		
		// 숫자 뒤에 f(F)를 부착하면
		// 단축형 실수가 된다.
		// 소수점이하 7째자리까지만 인식한다
		System.out.println(40.0F / 30F);
		System.out.println(40f / 30f);
		
		// 단정도 실수 :
		//		소수이하 7(6)째 자리까지 
		//		표현하는 실수
		// 배정도 실수 :
		//		단정소 실수의 2배 이상 자리까지
		//		표현한 실수
		// 고정소수점 연산(값)
		//		정수는 소수점이하 0번째 자리에서
		//		반올림한다.
		
		/*
		 * 
		 * 정수와 정수를 연산하면 결과도 정수
		 * 실수와 실수를 연산하면 결과도 실수
		 * 정수와 실수를 연산하면 결과는 실수
		 * 		단, 결과의 정확도는 예측할수 없는
		 * 		경우가 많다.
		 * 정수와 실수를 연산하면 먼저 정수를
		 * 		실수로 변환한 후에
		 * 		연산이 수행된다.
		 */
		 System.out.println(40.0 * 20.0);
		 System.out.println(40 * 20.1);
		
		
		
		
	}

}
