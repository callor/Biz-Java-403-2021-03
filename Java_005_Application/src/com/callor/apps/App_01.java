package com.callor.apps;

import java.util.Random;

/*
 * 25 ~ 50명 인원 있는 각 반에
 * pizza 간식을 지급하려고 한다.
 * 각 반의 학생들에게 
 * 	1 조각씩 pizza를 지급하려고 한다
 * 	학생수보다 부족하거나
 * 	6조각 이상 남지 않도록 pizza를 주문해야 한다
 *  몇 box의 pizza를 주문해야 하는지 코드로 구현하시오
 */
public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		rnd.nextInt(); // -2**31 ~ 2**31 - 1 중의 수
		rnd.nextInt(10); // 0 ~ (10-1), + 1(1 ~ 10)
		
		// 조각수
		int pizzaPcs = 6;
		
		// 25 ~ 50의 수 중에서 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25; // 25 ~ 50
		
		int pizzaBox = 0;
		// 정수 / 정수 ==> 몫이 몇개인가
		// 필요한 box 수와 
		// 같거나 1 작은 값이 만들어진다
		pizzaBox = intMembers / pizzaPcs;
		
		boolean bYes 
		= intMembers % (pizzaBox * pizzaPcs) == 0;
		
		// if( bYes == false ) {
		if( !bYes ) {
			pizzaBox++;
		}
		
		System.out.println("======================");
		System.out.println("인원수:" + intMembers);
		System.out.println("피자판수:" + pizzaBox);
		System.out.println("전체조각:" 
					+ pizzaBox * pizzaPcs);
		System.out.println("======================");
		
		
		
		
		
		
		
		
	}
	
}
