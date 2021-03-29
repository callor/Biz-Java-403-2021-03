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
	
	/*
	 * kor,eng, math 변수는 main() 메서드에서 
	 * 사용자에 의해 값을 저장하기 위한 변수이다
	 * 
	 * total, avg는 3과목의 점수를 사용하여
	 * 연산한 후 연산 결과를 저장하기 위한 변수이다
	 * 
	 * kor,eng, math는 어디에서든지 저장, 읽기가 가능한
	 * 상태이어야 하므로 public으로 선언을 한다.
	 * 
	 * 그런데
	 * total, avg 변수도 public으로 선언을 해 두었더니
	 * 실계 계산된 결과와 상관없이 임의의 값을 저장할수 있게 
	 * 되었다.
	 * 코드가 진행되는 과저어에서 total에 임의의 값이 저장되면
	 * 평균값이 어뚱하게 계산되는 결과가 나타난다.
	 * 이런경우 total, avg 변수를 임의로 수정(저장)하지 못하도록
	 * 막는 장치가 필요하다.
	 * 
	 * VO 클래스의 맴버변수를 private으로 선언하면
	 * 다른곳에서 객체를 통해(점연결 연산자를 통해) 직접
	 * 접근이 불가능 해 진다
	 * 
	 * total, avg를 private으로 선언하면
	 * 누구도 직접 total, avg에 값을 저장할 수 없다.
	 * 
	 * total, avg 변수에 담긴 값을 객체를 통해 읽기 하기 위해
	 * getTotal(), getAvg() 메서드를 만들어 두었다.
	 * 
	 * 이제부터 total, avg 변수는 저장기능은 되지않고
	 * getTotal(), getAvg() 메서드를 통해 읽기만 가능한
	 * 상태가 되었다.
	 * 
	 */
	private int total;
	private float avg;
	
	public int getTotal() {
		this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	
	public float getAvg() {
		
		// int intTotal = this.getTotal();
		int intTotal = this.total;
		float floatAvg = (float)intTotal / 3;
		return floatAvg;
		
	}
	

}
