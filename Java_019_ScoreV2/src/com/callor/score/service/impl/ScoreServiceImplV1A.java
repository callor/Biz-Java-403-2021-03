package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.callor.standard.InputService;
import com.callor.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A implements ScoreService {

	protected InputService inService;
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1A() {
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1A();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	/*
	 * 
	 * 학번입력하면
	 * scoreList에 같은 학번의 성적이 있는지 확인하여
	 * 있으면 저장이 안되게
	 * 이미 있으면 다시 학번을 입력하도록 해야 한다
	 * 
	 */
	@Override
	public void insertScore() {
		// TODO 성적입력

		// 유효성검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기 때문에 while() 전에 선언
		String strNum = null;
		while(true) {
			Integer intNum = inService.inputValue("학번",1);
			if(intNum == null) {
				return;
			}
			// 00001 형식으로 학번 변환(생성)
			strNum = String.format("%05d",intNum);
			
			// 이미 등록된 학번인가를 검사
			ScoreVO scoreVO = this.numCheck(strNum);
			if(scoreVO != null) {
				continue;
			}
			// 여기에 도달하면 
			//		학번에 해당하는 점수가 list에 없다!!
			// 학생정보에 등록된 학번인가를 검사하여
			//		학생정보에 없으면 다시 학번을 입력받고
			//		있으면 점수를 입력하도록 break;
			StudentVO stVO = stService.getStudent(strNum);
			if(stVO == null) {
				System.out.println("학적부에 없는 학생입니다!!");
				System.out.println("학번을 다시 입력해 주세요");
				continue;
			}
			
			// 여기 도달하면 학적부에 있는 학번이다
			System.out.println("=".repeat(30));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까 ?");
			System.out.println("맞으면 : Enter, 틀리면 : NO");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if( yesNo.equals("NO") ) {
				continue;
			}
			break;
		} // 학번입력 끝

		// 성적입력 부분...
		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		
		// 위에서 담겨있던 데이터는 clear되고
		// 새로운 scoreVO가 생성된다
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreList.add(scoreVO);

	} // end insertScore()
	
	// 파라메터로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoerVO를 return
	// 없으면 null을 return
	protected ScoreVO numCheck(String num) {
		for(ScoreVO vo : scoreList) {
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void loadService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

}
