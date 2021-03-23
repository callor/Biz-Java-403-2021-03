package com.callor.apps;

public class Pay_02 {
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		
		for(int index = 0; nPay > 0 ; index++ ) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권  %5d매\n",
					nPaper,nCount);
			nPay %= nPaper;
			
			// nPaper 2 또는 5로 나눠기
			if(index % 2 == 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
		}
		
		
	}

}
