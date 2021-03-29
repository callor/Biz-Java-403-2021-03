package com.callor.apps.model;

/*
 * ScoreVO 클래스 선언
 * ScoreVO 클래스에는 5개의 변수가 포함되어 있고
 * 이 5개의 변수는 반드시 ScoreVO 클래스를 객체로선언한 후
 * 사용할수 있다.
 */
public class ScoreVO {
	
	/*
	 * 현재 ScoreVO 클래스에는
	 * 7개의 변수와
	 * 2개의 method가 설계되어 있는 상태
	 * 이 클래스를 사용하여 만들어진 객체에는
	 * 
	 * 7개의 변수와 2개의 method가 포함된 상태로
	 * 완성이 된다.
	 * 
	 * 한번 객체로 생성이 되면, 내부의 변수들은
	 * 절대 다른 데이터와 혼동되거나 하지 않는다
	 */
	
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int total;
	public float avg;
	
	public int getTotal() {
		this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	
	public float getAvg() {
		
		int intTotal = this.getTotal();
		float floatAvg = (float)intTotal / 3;
		return floatAvg;
		
	}
	
	
	
	

}
