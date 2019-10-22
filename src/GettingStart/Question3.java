package GettingStart;

/*
 * 羅馬數字轉換規則
 * */

public class Question3 {

	public static void main(String[] args) {
		
		//12個羅馬符號排在一起，符合規則的數字有幾種?
		int N = 12; 
		
		int count = 0;
		
		//思考 : 4,9, 40,90 有相對應的數字，只要除以10位數在換算
		
		for(int i=0; i<=3999; i++) {
			
			if(countN(i) == N) {
				count++;
			}
		}
		System.out.println("12個羅馬符號排在一起，符合規則的數字有" + count + "種");
	}

	public static int countN(int i) {
		
		int countN = 0;
		
		int M = i / 1000;
		int C = (i-1000*M) / 100;
		int X = (i-1000*M - 100*C) / 10;
		int l = (i-1000*M-100*C-10*X);
		
		switch(M) {
			
			case 1 :
			case 5 : 
				countN += 1;
				break;
			case 2:
			case 6:
				countN += 2;
				break;
			case 3:
			case 7:
				countN += 3;
				break;
			case 4:
			case 9:
				countN += 2;
				break;
			case 8:
				countN += 4;
		}
		switch(C) {
		
		case 1 :
		case 5 : 
			countN += 1;
			break;
		case 2:
		case 6:
			countN += 2;
			break;
		case 3:
		case 7:
			countN += 3;
			break;
		case 4:
		case 9:
			countN += 2;
			break;
		case 8:
			countN += 4;
	}
		switch(X) {
		
		case 1 :
		case 5 : 
			countN += 1;
			break;
		case 2:
		case 6:
			countN += 2;
			break;
		case 3:
		case 7:
			countN += 3;
			break;
		case 4:
		case 9:
			countN += 2;
			break;
		case 8:
			countN += 4;
	}
		switch(l) {
		
		case 1 :
		case 5 : 
			countN += 1;
			break;
		case 2:
		case 6:
			countN += 2;
			break;
		case 3:
		case 7:
			countN += 3;
			break;
		case 4:
		case 9:
			countN += 2;
			break;
		case 8:
			countN += 4;
	}
		
		return countN;
		/*
		 * 100 : C
		 * 200 : CC
		 * 300 : CCC
		 * 400 : CD
		 * 500 : D
		 * 600 : DC
		 * 700 : DCC
		 * 800 : DCCC
		 * 900 : DM
		 * 
		 * */
		/*
		 * 10 : X
		 * 20 : XX
		 * 30 : XXX
		 * 40 : XL
		 * 50 : L
		 * 60 : LX
		 * 70 : LXX
		 * 80 : LXXX
		 * 90 : CX
		 * 
		 * */
		
		
	}
	
}
