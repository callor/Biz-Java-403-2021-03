package com.callor.score.model;

public class WordVO {
	
	private String english;
	private String korea;
	private Integer count;
	
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorea() {
		return korea;
	}
	public void setKorea(String korea) {
		this.korea = korea;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "WordVO [english=" + english + ", korea=" + korea + ", count=" + count + "]";
	}
	
	

}
