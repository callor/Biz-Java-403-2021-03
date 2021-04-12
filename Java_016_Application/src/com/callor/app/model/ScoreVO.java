package com.callor.app.model;

public class ScoreVO {
	
	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	// getter, setter 생성, toString() 재정의
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer total = this.kor;
		total += this.eng;
		total += this.math;
		return total;
	}
	public Float getAvg() {
		
		// C 언어 style
		Float avg = (float)this.getTotal() / 3;
		
		// Java style
		avg = Float.valueOf(this.getTotal()) / 3;
		return avg;
		
	}
	
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + this.getTotal() 
				+ ", avg=" + this.getAvg() + "]";
	}
}
