package com.callor.score.model;

public class ScoreVO {
	
	private String num;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
//	private Integer total;
//	private Float avg;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
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
		Integer total = this.kor + this.eng + this.math;
		return total;
	}
	public Float getAvg() {
		Float avg = (float)this.getTotal() / 3;
		return avg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [학번=" + num 
				+ ", 국어=" + kor 
				+ ", 영어=" + eng 
				+ ", 수학=" + math 
				+ ", 총점=" + this.getTotal()
				+ ", avg=" + this.getAvg() + "]";
	}

}
