package com.callor.method.service;

public class ScoreServiceV4 {
	/*
	 * 과목의 이름이 저장될 배열을 클래스영역에 선언
	 * 과목점수입력, 성적리스트 출력 등에서 사용하기 때문에
	 * 맴버변수 영역, 클래스 영억에 선언 
	 */
	protected String[] subject;
	protected InputServiceV2 inService;
	
	/*
	 * 생성자 method
	 * ScoreServiceV4 클래스를 사용하여
	 * 객체를 생성할때 호출할 method
	 */
	public ScoreServiceV4() {
		// 생성한다
		// 변수에 값을 저장, 객체를 초기화( new 생성자() 호출 )
		// 생성자에 작성되는 코드
		// 맴버변수 영역에 선언된 변수, 객체를 생성하는 코드
		subject = new String[] {"국어","영어","수학"};
		inService = new InputServiceV2();
	}
	
	// 키보드를 사용하여 3과목의 점수를 입력받는데
	// InputServiceV2에 선언된 method를 사용할 예정이므로
	// 여기에서는 키보드 등의 
	//		클래스, 객체를 사용할 필요가 없다
	public void inputScore() {
		/*
		 * 과목명을 배열로 선언한 이유는
		 * 점수를 입력받는 method 호출 코드를 한번만 작성하고
		 * for() 반복문을 사용하여 처리할수 있다
		 */
		
		// 과목의 점수를 저장할 score배열을 생성
		int[] scores = new int[ subject.length ];
		
		for(int i = 0 ; i < subject.length ; i++) {
			Integer score = inService.inputValue(subject[i], 0, 100);
			if(score == null) {
				System.out.println("종료");
				/*
				 * break 와 return
				 * break를 실행하면 for() 반복문만 중단하고
				 * for() 반복문 이후의 코드를 실행한다
				 * for() 반복문이후에 다른 연산(코드)를 
				 * 		수행할 필요가 있을때는 break
				 * 
				 * return을 실행하면 현재 method(inputScore())를
				 * 		무조건 종료해 버린다.
				 * 		inputScore() method를 호출했던 코드로
				 * 		되 돌아간다
				 */
				// break;
				return;
			}
			// return 받은 점수를 socores 배열의 i번째 위치에
			// 저장하라
			scores[i] = score;
		} // for end
		
		// scores 배열에 담긴 점수를 총점게산
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		
		// 과목의 개수 만큼 값으로 평균을 계산한다
		float avg = (float)sum  / subject.length ;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 :  " + avg);
		
	}
	
	
	
	
	

}
