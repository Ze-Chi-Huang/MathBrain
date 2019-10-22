package Example2;

public class Example2 {
	
	int tableMaxPeople = 10;
	int people = 100;

	public static void main(String[] args) {
		

		
		System.out.println(check(6,2));
	}

	static public int check(int remain, int preTable) {
		
		System.out.print("前一張桌子: " + preTable);
		System.out.println(", 剩下: " + remain);
		
		if(remain < 0) return 0;
		if(remain == 0) return 1;
		
		int count = 0;
		
		
		for( int i = preTable; i <= 10 ; i++) {
			
			count += check(remain-i, i);
			
		}
		return count;
		
		/*boolean check = false;
		
		for(int i=preTable; i < tableMaxPeople; i++) {
			
			if(remain == 0)return true;
			if(remain < 0) return false;
			
			remain = remain - i;
			for(int j = remain; j <=people; j++) {
				
			}
		}
		
		return check;*/
	}
}
