package com.callor.app.model;

public class DeckVO {
	
	private String suit;
	private String denomiation;
	private Integer value = 0;
	
	/*
	 * 기본생성 : 매개변수가 없는 생성자
	 * 		super constructor
	 * 		new DeckVO() 처럼 호출
	 * 
	 * 클래스를 정의하고 아무런 생성자를 만들지 않으면
	 * 		기본생성자는 자동으로 만들어져
	 * 		언제든지 객체를 생성할때 호출할수 있다.
	 * 
	 * 하지만, 매개변수가 (한개라도)있는 생성자를 만들면
	 * 		기본생성자는 만들어지지 않는다
	 */
	public DeckVO() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 필드(맴버)변수를 매개변수로 갖는 생성자
	 * 		Field Contructor
	 * 		new DeckVO( 값.... ) 처럼 호출
	 */
	public DeckVO(String suit, String denomiation, Integer value) {
		super();
		this.suit = suit;
		this.denomiation = denomiation;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomiation() {
		return denomiation;
	}
	public void setDenomiation(String denomiation) {
		this.denomiation = denomiation;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}
	
	

}
