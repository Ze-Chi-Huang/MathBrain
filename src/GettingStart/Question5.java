package GettingStart;
/*
 * 巴斯卡三角形
 * */
public class Question5 {
	

	public static void main(String[] args) {
		
		//製作n = k時的巴斯卡三角形陣列 
		
		//利用2維陣列儲存一個巴斯卡三角形 (不要一步想計算n = k 時的巴斯卡列數 (因為會用到前面的數字
		
		int n = 20;
		
		int[][] pascal = new int[n][n];

		//Pascal 初始值 (即第一個三角形)
		pascal[0][0] = 1;
		pascal[1][0] = 1;
		pascal[1][1] = 1;

		for(int row = 2; row < n; row++) {
			//控制列row
			for(int index = 1; index < n; index++) { 
				
				//第一個值永遠為1
				pascal[row][0] = 1; 
				
				//之後每個都是上一列的index 與 index-1 的和
				pascal[row][index] = pascal[row-1][index-1] + pascal[row-1][index] ;
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<pascal.length;i++) {
			
			for(int j=0; j<pascal[i].length;j++) {
				System.out.print(pascal[i][j] + ", ");
			}
			System.out.println();
		}
		
		for(int j=0; j<pascal[n-1].length;j++) {
			sum += pascal[n-1][j];
			
		}
		
		System.out.println(sum);
		System.out.println(1 << n-1);
		
	}

}
