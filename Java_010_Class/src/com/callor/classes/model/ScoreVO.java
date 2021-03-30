/*
 * 계층적 패키지 구조
 * base-package : 프로젝트에서 처음의 3단계 패키지
 * 		com.callor.classes
 * 		프로젝트의 id(유일한 키값) 역할을 수행한다.
 * 
 * service : main() method에서 수행할 연산들을
 * 		분산하여 작은 코드로 만들기 위한 클래스들의 모음
 * 		Service 클래스들
 * 
 * model : data를 저장하는, 데이터를 보관하는 
 * 		구조를 갖는 클래스들의 모음
 * 		VO(Value Object), DTO(Data Transfer Object)		
 * 
 */
package com.callor.classes.model;

/*
 * (한)학생의 성적처리를 하기 위한 기본데이터를
 * 저장하여 연산하는 곳으로 이동, 전달 하는 용도의'
 * 객체를 만들기 위한 클래스
 * 
 * 학번, 이름
 * 각 과목의 점수를 담을 변수
 * 총점, 평균
 * 
 * 학년, 반, 학과, 연락처
 * 
 */
public class ScoreVO {
	
	public String num;
	
	public int kor;
	public int eng;
	public int math;

}







