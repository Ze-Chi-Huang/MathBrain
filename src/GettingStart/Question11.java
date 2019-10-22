package GettingStart;

public class Question11 {

	public static void main(String[] args) {
		
		// 奧運主辦城市投票，若第一輪有城市得票過半，就確定主辦城市
		
		
		System.out.println(vote(4));

	}

	
	
	public static int vote(int n) {
		
		if( n <= 2) return 1; //若只有2個城市，必然只有需要在投票一次
		
		int count = 1; //某城市得票過半數，只投一次
		count += vote(n-1); //某處城市被淘汰，就再繼續投票
		
		
		
		for(int i=2; i<n; i++) { //最後一名的城市有i 處
			count += vote(i) * vote(n-1);
			System.out.println(i + ", " +count);
		}
		
		return count;
	}
}
