package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.app.model.ScoreVO;

public class ListEx_03 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		for(int i = 0 ; i < 10 ; i++) {
			
			String strNum = String.format("%03d", i+1);
			Integer intKor = rnd.nextInt(100) + 1;
			Integer intEng = rnd.nextInt(100) + 1;
			Integer intMath = rnd.nextInt(100) + 1;

//			ScoreVO scoreVO = new ScoreVO();
//			scoreVO.setStrNum(strNum);
//			scoreVO.setKor(intKor);
//			scoreVO.setEng(intEng);
//			scoreVO.setMath(intMath);

			ScoreVO scoreVO 
				= new ScoreVO(strNum, 
						intKor, 
						intEng, 
						intMath, 
						intEng, 
						intMath);
			scoreList.add(scoreVO);
		} // end for
		
		printScore(scoreList);
		totalAndAvg(scoreList);
		printScore(scoreList);
		sort(scoreList);
		printScore(scoreList);
		
		
	} // end main
	
	public static void totalAndAvg( List<ScoreVO> scList ) {
		for(ScoreVO sVO : scList) {
			Integer total = sVO.getKor();
			total += sVO.getEng();
			total += sVO.getMath();
			
			Integer avg = total / 3;
			sVO.setTotal(total);
			sVO.setAvg(avg);
		}
	} // end totalAndAvg

	// scList의 데이터중 total 변수를 기준으로
	// 정렬하기
	public static void sort( List<ScoreVO> scList ) {
		int nSize = scList.size();
		for(int i = 0 ; i < nSize ; i++) {
			for(int j = i + 1 ; j < nSize ; j++) {
				Integer total_I = scList.get(i).getTotal();
				Integer total_J = scList.get(j).getTotal();
				
				if(total_I > total_J) {
					ScoreVO v = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, v);
				}
			}
		}
	} // end sort
	
	
	public static void printScore(List<ScoreVO> scList) {
		System.out.println("=".repeat(50));
		for(ScoreVO vo : scList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(50));
	}
}





