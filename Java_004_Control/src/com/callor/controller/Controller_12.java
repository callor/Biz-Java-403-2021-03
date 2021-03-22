package com.callor.controller;

import java.util.Random;

/*
 * 1 ~ 100까지 범위의 임의 정수 10개 를 만들고
 * 3의 배수인지 검사하여 
 * 3의 배수이면 출력하고
 * 수 들의 합을 계산하여 출력하라
 * 
 * 변수의 선언 위치
 * 
 */
public class Controller_12 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		/*
		 * 1 ~ 100까지 램던수 10개
		 * 10개의 숫자가 모두 다르게 만들어라
		 */
		int intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt(100) + 1;
			if(num % 3 == 0) {
				System.out.println(num);
				intSum += num;
			}
		}
		System.out.println("===================");
		System.out.printf("합계:%d",intSum);
		
		// for() {  } 안에서 선언된 변수 num는
		// for() 명령이 끝나면 소멸된다.
		// 변수 i 도 for() 안에서 선언되었기 때문에
		// for() 명령이 끝나면 소멸된다.
		// System.out.println(num);
		
		/*
		 * scope(범위) 라고 한다.
		 * {} : 변수의 사용 범위를 제한하는 역할을 한다
		 * 
		 * 작성하는 코드는 main() { } 내에 있다
		 * 	여기에서 선언된 모든 변수는
		 * 	main() method가 종료하면 모두 소멸된다
		 * for() {  } 내에 선언된 모든 변수는
		 * 	for() 반목문이 종료되면 모두 소멸된다
		 * 
		 * if() { } 내에 선언된 모든 변수는
		 * 	if() 비교문이 종료되면 모두 소멸된다.
		 * 
		 * for() {}, if() {} 명령이 시작되기 전에
		 * 선언된 변수들은 for(), if() 명령문 내에서
		 * 사용(저장, 읽기)가 가능하고
		 * for(), if() 명령이 종료되어도 그 값을
		 * 	유지하고 있다.
		 * 
		 * for() 반복문이 수행되는 동안에 어떤 값을
		 * 	누적(합산)하거나 할때 
		 * 	for() 반복문이 시작되기전에 
		 * 	변수를 반드시 선언하고,
		 *  0으로 clear 하는 것이 좋다
		 */
	}

}
