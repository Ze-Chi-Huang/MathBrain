package GettingStart;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		
		int N = 100;
		
		for(int first=N; first>=0; first--) {
			
			for(int second = N-first; second >=0; second--) {
				
				int third = N- first - second;
					
					if(check(first ,second ,third)) {
						count++;
					}
			}
		}

		System.out.printf("%d個人一起猜拳，一次決定勝負組合有%d種", N, count);
		
	}
	
	public static boolean check(int x, int y, int z) {
		
		//最大的必須唯一
		int[] array = {x,y,z};
		Arrays.sort(array);
		
		/*
		//先排序，小的放前面
		if(y < x) {
			//x,y 交換
			int temp = x;
			x = y;
			y = temp;
			//System.out.println("x = " + x  + ", y = " + y + ", z = " + z);
		}
		
		if(z < y) {
			int temp = y;
			y = z;
			z = temp;
			
		}
		
		if(y < x) {
			
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println(x + "," + y + "," + z);
		
		
		if(z > y) {return true;}
		else {return false;}*/
		
		if(array[2] > array[1]) {return true;}
		else {return false;}
	}
}
