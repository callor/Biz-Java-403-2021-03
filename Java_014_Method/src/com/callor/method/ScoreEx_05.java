package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreEx_05 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		/*
		 * scoreVO라는 집을짓고(Heap 메모리에 생성)
		 * 값을 setter한 다음 
		 * 그 집의 주소를 scoreList에 저장하라
		 */
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(90);
		scoreVO.setEng(90);
		scoreVO.setMath(90);
		scoreList.add(scoreVO);

		/*
		 * 만약 scoreVO = new ScoreVO() 코드를 생략하면
		 * 이미 지어져있는 scoreVO에 데이터를 변경한 후
		 * 그 주소를 scoreList에 추가하라
		 * 이렇게 하면 첫번째 List가 가리키고 있는 집의
		 * 데이터가 변경되는 효과가 나타나서
		 * 모든 리스트의 데이터가 같아져 버린다.
		 * 
		 * 만약 VO 클래스를 사용하여 집을 짓고
		 * List에 추가를 하려면
		 * 항상 새 집을 먼저 지어야 한다.
		 */
		scoreVO = new ScoreVO();
		scoreVO.setKor(88);
		scoreVO.setEng(77);
		scoreVO.setMath(66);
		scoreList.add(scoreVO);

		scoreVO = new ScoreVO();
		scoreVO.setKor(55);
		scoreVO.setEng(55);
		scoreVO.setMath(55);
		scoreList.add(scoreVO);

		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
		}

		
		
	}

}




