package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_05 {
	
	public static void main(String[] args) {
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// System.out.println(reader);
				
				// 문자열.splite("기준문자열")
				// 문자열에 저장된 값을 기준문자열로 나누어
				// 문자열 배열로 만들어주는 method
				String[] scores = reader.split(":");
				System.out.printf("학번:%s, 국어:%s, 영어:%s, 수학:%s\n",
						scores[0],scores[1],scores[2],scores[3]);
				
				int intKor = Integer.valueOf(scores[1]);
				int intEng = Integer.valueOf(scores[2]);
				int intMath = Integer.valueOf(scores[3]);
				int sum = intKor + intEng + intMath;
				
				
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
