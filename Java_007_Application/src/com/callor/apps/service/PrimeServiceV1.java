package com.callor.apps.service;

import java.util.Random;

/*
 * Version
 * 
 * 프로젝트 개발 : 개발자가 사용하는 중, Developer Version
 * 누군가에게 Test 의뢰
 * 		같은팀의 누군가에게 : alpha Version
 * 		외부에 다른 누군가에게 : Beta Version
 * 
 * 사용자에게 배포(Deploy) : Release Version, Deploy Version
 * 		실제 사용하는 사람들에게 설치해서 써라!!
 * 		최초 배포 : V1.00 라고 버전정보를 명시, R1.00
 * 		약간의 문제가 발생하여 수정 :V1.01
 * 	
 * 배포후에 사용자의 피드백을 받아서 수정하고 재 배포
 * 		V1.xx, V1.xy ~ 
 * 
 * 사용자의 의견을 수렴하여 새로운 프로젝트를 기획, 제작, 배포
 * 		기존프로젝트를 V1이라고 하고
 * 		새롭게 기능이 개선(추가)되어 배포된 프로젝트를
 * 		V2.xx 라고 칭하여 배포를 한다
 */

/*
 * main() method에서 배열을 만들고
 * 값을 저장한 다음, Prime인가를 검사해서 출력했다
 * 
 * 이 코드를 PrimeService 클래스를 만들고
 * 분리해서 다시 작성하기
 * 
 */

// class 이름짓기
// 		첫글자 대문자
//		이후는 camel case
//		(Upper)CamelCase 방식이라고 한다.

// Service 클래스
// main()에 종합적으로 작성된 코드를
// method들을 만들어 분리하고
// 코드 관리를 쉽게 하도록 만드는 클래스(파일)들
public class PrimeServiceV1 {
	
	// 어떤 변수를 사용하여 프로젝트를 수행할 것인가
	// 여러(2개이상)의 method에서 공통으로 사용할 변수들은
	//		변수를 사용한다 == 변수를 참조 : 저장, 읽기
	// 클래스 영역에 설정을 한다
	int[] intNums; // int[] intNums = new int[20]
	
	// 생성자(Contructor) method
	// 		void 키워드를 사용하지 안는다
	// 		이름이 클래스 이름과 같다
	// intNums배열을 설정(초기화, 개수지정)을 하여
	// 사용할 준비
	public PrimeServiceV1() {
		intNums = new int[20];
	}
	
	// method는 첫글자 소문자로 시작하여
	// 		변수 이름짓기와 같은 방식으로 이름을 짓는다
	//		LowerCamelCase
	// Random 클래스로 값을 만들어 배열에 저장
	public void makeNums() {
		Random rnd = new Random();
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
	}

	// 저장된 값이 Prime인가 검사하여 출력하기
	public void printPrime() {
		
		for(int arr = 0 ; arr < intNums.length ; arr++) {
			
			int numP = intNums[arr];
			int num = 0;
			for(num = 2 ; num < numP ; num++) {
				if(numP % num == 0) {
					break;
				}
			}
			if(num < numP) {
				System.out.println(numP +"는 소수아님");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
	}
	
	
	

}







