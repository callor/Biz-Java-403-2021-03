package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01A {
	
	public static void main(String[] args) {
		
		// 선언하는 코드와 생성하는 코드를 분리하자!!
		// FileWriter, FileReader : 파일을 Open
		// PrintWriter, BufferedReader : 내용을 쓰고, 읽
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/student.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			// 파일을 무조건 한 라인씩 읽어라
			while(true) {
				String reader = buffer.readLine();
				
				// 파일의 끝에 다다르면 더이상 읽지 마라
				// EOF(End Of File) 가 되면 reader 변수에
				//		null 값이 담기게 된다
				// reader에 null값이 담겨 있다 == 다 읽었다
				if(reader == null) break; 
				// 이후 다른 연산 처리
				
				System.out.println(reader);
			}

			/* =====================================
			 * 
			 * 
			 */
			// 문자열 변수 reader를 null이 아닌 값으로
			// 		생성하기
			String reader = new String(); // ""

			// 최초에 while()문에서 
			// reader != null은 true가 된다
			while( reader != null ) {
				reader = buffer.readLine();
			}
			// ========================================
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생");
		}
		
	}
	

}
