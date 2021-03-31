package com.callor.classes.model;
/*
 * 매입매출 프로젝트
 * 	마트, 편의점, 쇼핑몰 등에서 공산품을 구매하여
 * 	고객에게 마진을 붙여 판매하고 이익금등을 계산하는
 * 	프로젝트
 * 
 * 	소매점(도매점 등으로 부터 구매하여 일반 소비자에게 판매) 
 *  도매점(생산공장에서 구매하여, 소매점에 판매)
 *  
 *  기본적으로 필요한 데이터 항목
 *  객체지향 이론에서 추상화(단계) 라고 한다
 *  상품이름(pname) String, 
 *  거래일자(date) 2021-03-31 String, 
 *  거래처(dname) String, 
 *  매입매출구분(inout) String
 *  수량(qty) Integer, 
 *  매입단가(iprice) Integer, 
 *  매출단가(oprice) Integer
 *  
 */
public class IolistVO {

	// 객체지향 이론(특징)에서 "정보의 은닉"하기
	private String pname;
	private String date;
	private String dname;
	private String inout;
	private Integer qty;
	private Integer iprice;
	private Integer oprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getIprice() {
		return iprice;
	}
	public void setIprice(Integer iprice) {
		this.iprice = iprice;
	}
	public Integer getOprice() {
		return oprice;
	}
	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}
	
}
