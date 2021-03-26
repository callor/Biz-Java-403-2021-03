package com.callor.apps;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * 임의의 1 ~ 10까지 정수 1개를 만들고
 * 키보드로 숫자를 입력받아서
 * 임의로 생성된 정수를 맞추는 게임
 * 
 */

public class KeyInput_07 {
	
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int rndNum = rnd.nextInt(10) + 1;
		int nCount = 0;
		
		while(true) {
			
			if(nCount > 5) {
				System.out.println("게임에 소질이 없군요");
				System.out.println("다시한번 도전해 봅시다");
				nCount = 0;
				rndNum = rnd.nextInt(10) + 1;
			}
			
			System.out.println("1~10까지 정수 입력!!");
			System.out.print(">> ");
			int inputNum = scan.nextInt();
			if(inputNum == rndNum) {
				nCount = 0;
				System.out.println("참 잘했어요!!!");
				System.out.print("게속할까요? (Yes:1, No:0) >> ");
				int yesNo = scan.nextInt();
				if(yesNo == 0) {
					break;
				} else {
					rndNum = rnd.nextInt(10) + 1;
				}
			} else if( inputNum < rndNum) {
				System.out.println("입력한 수보다 큼!!");
				nCount ++;
			} else if( inputNum > rndNum) {
				System.out.println("입력한 수보다 작음!!");
				nCount ++;
			}
		}
		System.out.println("Game Over!!!");
	}

}
