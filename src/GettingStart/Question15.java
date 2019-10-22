package GettingStart;

public class Question15 {

	public static void main(String[] args) {
		
		//問當有3000個節點，以廣度優先的第2500個節點會是以深度優先的二元樹的第幾個節點 ?
		
		//思考: 找到節點編號後，要連同上一個節點編號一起保留，以判斷方向
		
		/*int pre = 0;
		int now = 1;
		int N = 2500;
		int M = 3000;
		
		int n = N;
		
		while(n>1) { //開始用深度優先的二元樹跑
			
			//往下跑的時候
			if()
			
			
		}*/
		
		//思考: 直接存兩個大小3000的陣列，依各自的邏輯設值後再換算過去
		
		int[] broadArray = new int[3000];
		int[] deepArray = new int[3000];
		
		//深度存值
		for(int i=1; i<=3000; i++) {
			
			//第一個放1，第二個放2，第三個放8，第四個放3
			//向左下走就會是2*i，右下走會是2*i+1，
			
			//deepArray[i] =  
			
		}
		

	}

}
