package com.callor.apps;

import java.util.Random;

public class App_07 {
	
	/*
	 * 어떤 배열에 
	 * 7, 2, 4, 3, 1 이런값이 저장되어 있을때
	 * 1, 2, 3, 4, 7 과 같이 정렬(Sort)하고자 할때
	 * 
	 * 최초 : 7, 2, 4, 3, 1 일때
	 * 0번 요소(7), 1번 요소(2) 두 값을 크기 비교
	 * 0번에 2를 저장, 1에 7을 저장하여 자리 바꿈
	 * 2, 7, 4, 3, 1 로 만듦
	 * 
	 * 0번 요소(2), 2번 요소(4) 두 값을 크기 비교
	 * 4가 더 큰값이므로 그냥 둔다
	 * 2, 7, 4, 3, 1 로 유지
	 * 
	 * 0번 요소(2), 3번 요소(3) 두 값을 크기 비교
	 * 3이 더 큰값이므로 그냥 둔다
	 * 2, 7, 4, 3, 1 로 유지
	 * 
	 * 0번 요소(2), 4번 요소(1) 두 값을 크기 비교
	 * 2가 더 큰값이므로 자리 바꿈
	 * 1, 7, 4, 3, 2 로 만듦
	 * 
	 * 1번 요소(7), 2번 요소(4) 두 값을 크기 비교
	 * 7이 더 큰값 이므로
	 * 1, 4, 7, 3, 2 로 만듦
	 * 
	 * 1번 요소(4), 3번요소(3) 두 값을 크기 비교
	 * 4가 더 큰값 이므로
	 * 1, 3, 7, 4, 2 로 만듦
	 * 
	 * 1번 요소(3), 4번 요소(2) 두 값을 크기비교
	 * 3이 더 큰값 이므로
	 * 1, 2, 7, 4, 3 로 만듦
	 * 
	 * 2번 요소(7), 3번 요소(4) 두 값을 크기비교
	 * 7이 더 큰값 이므로
	 * 1, 2, 4, 7, 3 로 만듦
	 * 
	 * 2번 요소(4), 4번요소(3) 두 값을 크기비교
	 * 4가 더 큰값 이므로
	 * 1, 2, 3, 7, 4 로 만듦
	 * 
	 * 3번 요소(7), 4번요소(4) 두 값을 크기비교
	 * 7이 더 큰값
	 * 1, 2, 3, 4, 7 로 만듦
	 * 
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[5];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		for(int num : intNums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println("====================");
		System.out.println("오름차순 정렬(작->큰)");
		System.out.println("--------------------");
		
		/*
		 * intNums[0]에 저장된 값과
		 * intNums[1]에 저장된 값을 교환
		 */
		int t = intNums[0];
		intNums[0] = intNums[1];
		intNums[1] = t;
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.print(num1);
		System.out.println(num2);
		/*
		 * 두 변수의 값을 서로 바꾸려면(교환)
		 * 제3의 임시저장소 변수가 필요하다
		 */
		int temp = num1; // num1의 값을 임시저장
		num1 = num2;
		num2 = temp;
		System.out.print(num1);
		System.out.println(num2);
		
	}
}
