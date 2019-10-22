package Example1;

import java.util.ArrayList;
import java.util.List;

/* 
 * 一張桌子最多坐10人，一張桌子不能只坐一人
 * 問 人數為100，桌子不限，共有幾種分法?
 * 思考 : 決定第一張桌子跟前一張桌子的人數
*/

public class Example1 {

	public static void main(String[] args) {

		
		
		
		System.out.println(check1(6,2));

		
	}
	

	//用剩餘人數跟前一張桌子的數量去check
	public static int check1(int remain, int pre) {

		if(remain < 0) return 0;
		if(remain == 0) return 1;
		
		int count = 0;
		
		for( int i = pre; i<=10 ; i++) {
			count += check1(remain-i, i);
		}
		return count;
	}
	
	
	/*
	public static check2(int remain, int pre) {
		
		int[][] table = new int[11][];
		
		for(int i=0; i<=10; i++) {
			
			table[i] = new int[101];
			
			for(int j=0; j<=100; j++) {
				table[i][j] =0;
			}
		}
		
		for(int i=0; i<=10; i++) {
			table[i][0] = 1;
		}
		
		for(int i=1; i<=100; i++) {
			
			for( int j=2; j<=10; j++) {
				
				if((i>=2) && (j>=i)) {
					table[i][j] = table[i][j-1];
				}
				
				if(i>2) table[i][j] += table[i-1][j];
				
			}
			
		}
	}*/
	
}
