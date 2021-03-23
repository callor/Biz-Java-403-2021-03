package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급 하려고 합니다.
 * 학급의 인원은 50 ~ 59명입니다
 * 학급 인원은 Random 클래스를 이용하여 생성합니다
 * 피자는 1box에 6조각입니다
 * 다음과 같이 주문 리스트를 출력합니다.
 */
public class App_04A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intClass1 = rnd.nextInt(10) + 50;
		int intClass2 = rnd.nextInt(10) + 50;
		int intClass3 = rnd.nextInt(10) + 50;
		int intClass4 = rnd.nextInt(10) + 50;
		int intClass5 = rnd.nextInt(10) + 50;
		
		int intTotal = 0;
		
		System.out.println("============================");
		System.out.println("인원수\t피자주문\t전체");
		System.out.println("----------------------------");
		// 1반
		int pizzaBox = intClass1 / 6;
		if(intClass1 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		
		intTotal += pizzaBox;
		System.out.print(intClass1 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		// 2반
		pizzaBox = intClass1 / 6;
		if(intClass2 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		
		intTotal += pizzaBox;
		System.out.print(intClass2 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);

		// 3반
		pizzaBox = intClass1 / 6;
		if(intClass3 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		
		intTotal += pizzaBox;
		System.out.print(intClass3 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		// 4반
		pizzaBox = intClass1 / 6;
		if(intClass4 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		
		intTotal += pizzaBox;
		System.out.print(intClass4 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		// 5반
		pizzaBox = intClass1 / 6;
		if(intClass5 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		
		intTotal += pizzaBox;
		System.out.print(intClass5 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		System.out.println("-------------------");
		System.out.println("전체 주문 BOX 수량:" + intTotal);
		
		
	}

}
