package com.callor.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_01 {

	public static void main(String[] args) {
	
		/*
		 * java 1.8 부터 사용할수있는 새로운 날짜
		 * 관련 클래스
		 * 
		 * 기존에 Date, Calendar 클래스가 있는데
		 * 날짜와 관련된 많은 이슈가 발생한다
		 * 
		 * java 1.8부터 새로운 날짜 시간과 관련된
		 * 코딩을 할때 사용하는 클래스가 만들어 졌다
		 * 
		 */
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		
		System.out.println(local.getDayOfMonth());
		System.out.println(local.getDayOfYear());
		System.out.println(local.getDayOfWeek());
		
		System.out.println(local.plusDays(20));
		System.out.println(local.minusDays(10));
		
		System.out.println(local.plusMonths(1));
		
		// 올해 첫날이 몇일이냐
		System.out.println(
		  local.with(TemporalAdjusters.firstDayOfYear())
		);
		System.out.println(
		  local.with(TemporalAdjusters.firstDayOfMonth())
		);
		// 오늘부터 3일후가 포함된 달의 마지막날
		System.out.println(
		  local.plusDays(3)
		  	.with(TemporalAdjusters.lastDayOfMonth())
		);
	}
}
