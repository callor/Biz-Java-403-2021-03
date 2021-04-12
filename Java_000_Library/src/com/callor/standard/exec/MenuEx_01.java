package com.callor.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.standard.MenuService;
import com.callor.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	
	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적 입력");
		menuList.add("성적 리스트 출력");
		menuList.add("성적 성적저장");
		menuList.add("성적 정보 이메일 보내기");
		menuList.add("기타여러가지");
		menuList.add("학생정보 입력");
		
		// new MenuServiceImplV1() 처럼 호출할수 없다
		// 왜 : 생성자에 매개변수를 선언했기 때문에
		MenuService menuService 
			= new MenuServiceImplV1("빛고을 고교 성적처리", menuList);
		
		Integer menu = menuService.selectMenu();
		System.out.println(menu);
		
				
		
	}
	

}
