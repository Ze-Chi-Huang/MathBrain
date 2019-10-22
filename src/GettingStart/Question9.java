package GettingStart;
/*10進位的自戀數*/

public class Question9 {

	public static void main(String[] args) {
		
		//求9999以內的所有自戀數
		
		for(int i=1; i<=9999; i++) {
			if(checkNarcissistic(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static boolean checkNarcissistic(int number) {

		char[] array = Integer.toString(number).toCharArray();

		int result = 0;
		for(int i=array.length-1; i>=0; i--) {
			
			result += Math.pow(Double.parseDouble(String.valueOf(array[i])), 3);		
		}
		
		
		
		if(number == result) {
			
			return true;
			
		}else {
			
		return false;
		
		}
	}
	
}
