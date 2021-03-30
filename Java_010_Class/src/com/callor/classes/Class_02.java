package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class Class_02 {
	
	public static void main(String[] args) {
		/*
		 * 
		 * Java에서 제공되는 
		 * 매우 사용이 편리한 배열자료구조
		 * 1. 몇개의 데이터를 저장할지 미리 정하지 않아도 된다.
		 * 2. 필요에 따라서 개수를 늘리거나 줄일 수 있다.
		 * 3. 매우 다양한 여러가지 기능이 이미 준비되어 있다
		 * 
		 * Integer 형(type)의 
		 * 		데이터를 다수 저장(List형 데이터)할
		 * 		intList 객체를 선언
		 * Integer[] intList = new Integer[??];
		 * 
		 * List 클래스를 사용하여 intList 객체를 선언한다
		 * 	단, intList에는 
		 * 		Integer 형 데이터만 저장할 수 있다
		 * <Integer> : Generic 선언
		 * 		저장될 데이터의 type을 규정하는 방법
		 * 		primitive형은 포함할 수 없다
		 * 		반드시 wrapper class 형만 포함할 수 있다.
		 * 
		 * List 형 객체 : List클래스를 사용한 객체
		 * 		선언할때는 List를 사용하고
		 * 		생성(초기화)할때는 ArrayList() 생성자를 사용
		 * 
		 * List 형 객체를 선언하고 ArrayList()로 생성을 하면
		 * 		size가 0인 배열객체가 생성되는 것과 유사하
		 */
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<Long> longList = new ArrayList<Long>();
		List<Double> douList = new ArrayList<Double>();
		List<Boolean> booList = new ArrayList<Boolean>();
		List<Float> floatList = new ArrayList<Float>();
		List<Character> charList = new ArrayList<Character>();
		
		// 배열에 값을 저장할때는 원하는 length 만큼
		// 배열을 선언 생성하고 첨자를 사용하여 위치를
		// 지정한 후 값을 저장
		int[] nums = new int[5];
		nums[0] = 100;
		
		// List형 객체에 데이터를 저장할때는
		// "추가"를 하여 저장
		// List형 객체에 데이터를 추가할때는
		//	.add() method 사용하여 데이터를 추가한다
		
		// intList의 size 가 1이 되고
		// 자동으로 0번 위치에 100이 저장
		intList.add(100); // 0번위치 
		intList.add(200); // 1번위치
		intList.add(300); // 2번위치
		
		// intList의 0번 위치에 저장된 값을 읽고 싶다
		System.out.println( intList.get(0)  );
		System.out.println( intList.get(1)  );
		System.out.println( intList.get(2)  );
		
		// 값을 읽을때 저장된 데이터 개수의 index범위를
		// 벗어날수 없다
		// 위에서 add() 3번 실행했기 때문에
		// 		size 는 3이되고
		//		get(index) 를 수행할때 
		//		index 값은 size - 1까지만 사용할 수 있다.
		// System.out.println( intList.get(3)  );
		
	}

}


