package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.standard.InputService;
import com.callor.standard.MenuService;
import com.callor.standard.impl.InputServiceImplV1;
import com.callor.word.domain.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1{
	
	// protected InputService inService;
	// protected MenuService mService;
	// protected Scanner scan;
	
	// protected List<WordVO> wordList; // word 들의 리스트
	// protected int nWordCount; // wordList의 개수를 담을 변수
	
	// protected Random rnd;
	
	// protected final int 영어 = 0;
	// protected final int 한글 = 1;
	
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
		String viewWord[] = this.getSuffleWord();
		while(true) {
			this.inputWord( viewWord );	
		}
		// 점수계산
	}
	
	protected String[] getSuffleWord() {
		int nWordIndex = rnd.nextInt(nWordCount);
		// WordVO wordVO = wordList.get(nWordIndex);
		gameWord = wordList.get(nWordIndex);
		String[] suffleEnglish 
			= this.suffleWord(gameWord.getEnglish());
		return suffleEnglish;
	}

	/*
	 * suffle된 단어배열을 매개변수로 받고
	 * 게임을 진행하기
	 */
	@Override
	protected void inputWord(String[] viewWord) {
		// TODO Auto-generated method stub
		super.inputWord(viewWord);
	}
	
	

}
