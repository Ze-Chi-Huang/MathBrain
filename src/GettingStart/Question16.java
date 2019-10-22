package GettingStart;

public class Question16 {

	public static void main(String[] args) {
		// 分母分子總和為1234567，介於0-1之間的最簡分數有幾個
		int N = 1234567;
		int count = 0;
		
		for(int mother = N; mother >= 1; mother--) {
			
			int child = N-mother;
			if(simplies(mother,child) && mother > child) {
				count++;
			}
			
		}
		System.out.println(count);
	}

	private static boolean simplies(int mother, int child) {
		
		//最簡分數 = 分母分子的最大公因數為1
		int maxCommonFactor = getMaxCommonFactor(mother,child);
		if(maxCommonFactor == 1) return true;
		else return false;
		
	}

	private static int getMaxCommonFactor(int a, int b) {

		if(b==0) return a;

		return getMaxCommonFactor(b, a%b);
	}
	
	
}
