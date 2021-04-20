package com.callor.word.service.impl;

import java.util.Arrays;

import com.callor.word.domain.WordVO;

/*
 * 점수 처리
 * 단어를 맞추면 점수를 (+)
 * 단어를 틀리면 재도전 하면 (-)
 * 힌트를 요구하면 점수를 (-)
 * 건너뛰기 (-)
 *  
 */
public class WordServiceImplV2 extends WordServiceImplV1{
	
	protected WordVO gameWord;

	/*
	 * getSuffleWord() method를 호출하여
	 * suffle된 영단어를 받고
	 * 
	 * 반복하여
	 * suffle된 영단어를 inputWord()에게 전달하여
	 * 게임을 진행한다
	 */
	public void startGame() {
		
		while(true) {
			// 게임용 단어 만들기
			int nWordIndex = rnd.nextInt(nWordCount);
			WordVO wordVO = wordList.get(nWordIndex);
			
			// getSuffleWord() 사용하지 않고
			// 직업 suffleWord()를 호출하도록 변경
			String viewWord[] 
					= this.suffleWord(wordVO.getEnglish());
			
			while(true) {
				String strInput = this.inputWord( viewWord );
				if(strInput.equals("Quit")) {
					System.out.println("게임종료");
					/*
					 * return문은 반복문의 
					 * 겹침 개수에 관계없이
					 * 무조건 현재 method자체가 끝나버린다
					 */
					return;
				} else if(strInput.equals("1")) {
					/*
					 * 반복문{ 반복문{} } 처엄
					 * 반복문이 겹처있을때
					 * 안쪽의 반복문에서 break를 실행하면
					 * 한계단씩 반복문이 해제된다 
					 */
					break;
				} else if(strInput.equals("2")) {
					this.hint(wordVO);
//					System.out.println("+".repeat(50));
//					System.out.println("힌트보기!!!!");
//					System.out.println(wordVO.getKorea());
//					System.out.println("+".repeat(50));
				} else {
					
					// 점수 계산
					this.yesNo(wordVO, strInput);
					
//					String strEng = wordVO.getEnglish();
//					if(strEng.equalsIgnoreCase(strInput)) {
//						System.out.println("맞았습니다");
//					}
				}
			}
			
		} // main while
	}
	
	// 힌트보여주기
	protected void hint(WordVO wordVO) {
		System.out.println("+".repeat(50));
		System.out.println(wordVO.getKorea());
		System.out.println("+".repeat(50));
	}
	
	// 단어 채점
	protected void yesNo(WordVO wordVO, String input) {
		String strEng = wordVO.getEnglish();
		if(strEng.equalsIgnoreCase(input)) {
			System.out.println("맞았습니다");
		}
	}
	
	/*
	 * suffle된 단어배열을 매개변수로 받고
	 * 게임을 진행하기
	 */
	protected String inputWord(String[] viewWord) {
		
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 영단어 게임 V2");
		System.out.println("-".repeat(50));
		System.out.println("다음 보여지는 단어를 바르게 배열하시오");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		while(true) {
			
			System.out.println("1. 다음게임(Skip)");
			System.out.println("2. 힌트보기");
			System.out.println("Quit : 게임중단");
			
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if(strInput.equals("")) {
				System.out.println("단어나, 메뉴를 선택하세요");
				continue;
			}
			return strInput;
		}
	}
	
	
	
	/*
	 * list에서 getter된 영단어VO를 
	 * 전역변수(클래스영역에 맴버변수)로 선언하고
	 * 단어를 저장했다
	 * 
	 *  그랬더니
	 *  영단어VO는 다른 method에서도 참조하는 변수가 되고
	 *  method간에 서로 관심을 가져야 되는 사이가 되어 버린다
	 *  이런 상황이 진행되면
	 *  영단어VO변수의 상태를 잘 관리해야하는 문제가 발생한다
	 *  
	 *  getSuffleWord()를 사용하지 않고
	 *  list에서 영단어VO를 getter하고 직접 데이터를 관리하도록
	 *  만든다
	 *  
	 */
//	protected String[] getSuffleWord() {
//	
//		String[] suffleEnglish 
//			= this.suffleWord(gameWord.getEnglish());
//		return suffleEnglish;
//	}


	
	

}
