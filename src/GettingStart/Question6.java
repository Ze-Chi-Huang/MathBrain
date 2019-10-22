package GettingStart;

/*
 * 長方形製作正方形
 * */

public class Question6 {

	public static void main(String[] args) {
		
		// 長邊長度低於1000，正方形數量剛好為20個的長方形有幾種?
		
		//思考 長方形的長 / 寬 會產生(長 / 寬)個正方形，之後長寬互換，直到寬=0為止
		
		//int height = 1, width = 1 ; //討論到1000為止
		int count = 0, length = 1000, square = 20;
		
		for( int width = 1; width <= length; width++) {
			
			for(int height = width; height <= length ;height++) {
			
				if(countSquare(height,width) == square) count++;
			}
		}

		System.out.println(count);
	}

	public static int countSquare(int height, int width) {
		
		int squareN = 0;
		
		while(true) {
			
			squareN += height / width;
			int temp = width;
			width = height % width;
			height = temp;
			
			if(width ==0) break;
		}
		
		return squareN;
		
	}

}
