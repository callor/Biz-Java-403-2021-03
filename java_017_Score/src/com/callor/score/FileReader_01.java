package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(fileName);
			
			/*
			 * read() method를 실행하면 어떤 값을 읽어서
			 * int 형의 데이터를 return 하도록 만들어져 있다
			 * 
			 * 현재 열린 파일에서 1byte를 읽어서
			 * ASCII 코드로 return하는 method
			 * 
			 */
			int result = fileReader.read();
			// 정수값이 해당하는 
			// ASCII코드를 갖는 
			// 문자로 바꾸어서 보여달라
			System.out.printf("%c",result);
			
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
