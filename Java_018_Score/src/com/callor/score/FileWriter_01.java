package com.callor.score;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/test1.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			for(int i = 0 ; i < 10 ; i++) {
				out.printf("%05d\n",i+1);
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
