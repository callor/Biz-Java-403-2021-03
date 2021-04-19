package com.callor.word.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * model package
 * MVC(Model View Controller) 패턴의 프로젝트에서는
 * VO 클래스가 저장되는 package를 보통 model 로 작성을 한다
 * 
 * domain package
 * DBMS와 연동되는 프로젝트에서 사용하기도 하는 이름
 * 
 * command package
 */

// Annotaion  
// 	@Override 처럼
//		Annotaion으로 키워드를 지정하므로써
//		단순히 반복 작성해야하는 코드를 자동으로 만들어주는
//		효과를 낸다
@Getter
@Setter
@ToString
public class WordVO {
	
	// 정보의 은닉
	private String english;
	private String korea;
	private Integer count;

}
