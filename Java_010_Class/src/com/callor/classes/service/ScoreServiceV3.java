package com.callor.classes.service;

/*
 * V2까지는 학생의 성적을 입력받다가
 * 중단을 하면 리스트를 보여주는 형식이었다
 * V3에서는 업무를 선택할수 있는 menu를 보여주고
 * 선택된 menu에 따라 업무를 진행하도록 upgrade
 * ================================
 * 빛나라 고교 성적시스템 V1
 * --------------------------------
 * 1. 성적입력
 * 2. 성적리스트 출력
 * 0. 업무 종료
 * ---------------------------------
 * 업무선택 >>
 * =================================
 */
public class ScoreServiceV3 extends ScoreServiceV2 {

	public void menuScore() {
		while(true) {
			System.out.println(Lines.dLine(50));
			System.out.println("빛나라 고교 성적 시스템 V1");
			System.out.println(Lines.sLine(50));
			System.out.println("1.한명 성적 추가");
			System.out.println("2.계속 성적 추가");
			System.out.println("3.성적리스트 출력");
			System.out.println("0.업무종료");
			System.out.println(Lines.sLine(50));
			System.out.print("업무선택 >> ");
			int intMenu = scan.nextInt();
			if(intMenu == 1) {
				// 성적입력
				this.inputScore();
			} else if (intMenu == 2) {
				while(true) {
					if(this.inputScore() == null) {
						break;
					}
				}
			} else if (intMenu == 3) {
				this.printScore();
			} else if(intMenu == 0) {
				System.out.println("업무종료!! 야 퇴근이다");
				return;
			}
		}
		
	}
}






