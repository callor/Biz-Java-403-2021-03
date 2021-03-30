package com.callor.classes.model;

public class AddressVO {
	
	private String name;
	private String addr;
	private String tel;
	private Integer age;
	
	/*
	 * age 변수는 private 이기 때문에
	 * 외부에서 직접 접근이 불가능하다
	 * 
	 * age 변수에 값을 저장하려면
	 * 반드시 setAge(setter() method)를 통해서
	 * 값을 저장해야 한다
	 * 
	 * setAge() method는 매개변수로 받은 나이를
	 * 유효성검사를 수행한다음
	 * 		유효한 범위에 있지않으면 null을 저장하여
	 * 		이후 값을 조회 했을때 
	 * 		잘못된 값이 저장되었다는것을
	 * 		암시적으로 표현하도록 했다
	 * 		(null을 저장하였다)
	 */
	public void setAge(Integer age) {
		if(age > 1 && age < 120) {
			this.age = age;
		} else {
			this.age = null;
		}
	}
	public Integer getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// private 으로 선언된 변수를 외부에서 읽을수 있도록
	// 일부 제한적으로 개방하기
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public String getTel() {
		return this.tel;
	}

}
