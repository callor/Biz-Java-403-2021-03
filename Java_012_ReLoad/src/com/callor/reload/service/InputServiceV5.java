package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {
	
	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		
		System.out.println("2개의 정수를 입력");
		System.out.println("두번째 정수는 첫번째보다 작게");
		System.out.print("첫번째>> ");
		String strNum1 = scan.nextLine();
		
		Integer intNum1 = 0;
		try {
			intNum1 = Integer.valueOf(strNum1);
		} catch (Exception e) {
			System.out.println("숫자로만 입력");
			// continue;
		}
		
		System.out.print("두번째>> ");
		String strNum2 = scan.nextLine();
		
		Integer intNum2 = 0;
		try {
			intNum2 = Integer.valueOf(strNum2);
		} catch (Exception e) {
			System.out.println("숫자로만 입력");
			// continue
		}
		
		if(intNum1 < intNum2) {
			System.out.println(intNum1 + " 보다 작은값으로 입력");
			// continue
		}
		
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		numList.add(numberVO);
		
	}
	
	public void printNum() {
		for(int i = 0 ; i < numList.size() ; i++) {
			NumberVO vo = numList.get(i);

			System.out.print(vo.getNum1()); 
			System.out.print(" - ");
			System.out.print(vo.getNum2());
			
			System.out.print(" = ");
			System.out.println(vo.getNum1() - vo.getNum1());
			
		}
	}
	
	

}
