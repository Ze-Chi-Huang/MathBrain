package GettingStart;

/*
 * 以亮燈數思考的數位時鐘
 * */

public class Question4 {

	public static void main(String[] args) {
		
		//亮燈數為30 處的時間有幾種
		
		int count =0;
		
		//事先儲存計算成果
		int[] lightArray = new int[60];
		for(int i=0; i<60; i++) {
			
			lightArray[i] = lightCount(i);
		}
		
		
		for(int hour = 0; hour<=23; hour++) {
			for( int mins = 0; mins<=59; mins++) {
				for(int sec =0; sec<=59; sec++) {
					
					//if(lightCount(hour)+lightCount(mins)+lightCount(sec) == 30) count++;
					if(lightArray[hour]+lightArray[mins]+lightArray[sec] ==30) count++;
				}
			}
			
		}
		
		System.out.println("亮燈數為30 處的時間有" + count + "種");
		
	}
	
	public static int lightCount(int i) {
		
		int lightCount = 0;
		
		int ten = i / 10;
		int one = i % 10;
		
		int[] array = {6,2,5,5,4,5,6,3,7,6};
		
		return array[ten] + array[one];
		/*
		
		switch(ten) {
			case 0:
			case 6:
			case 9:
				lightCount += 6;
				break;
			case 1:
				lightCount += 2;
				break;
			case 2:
			case 3:
			case 5:
				lightCount += 5;
				break;
			case 4:
				lightCount += 4;
				break;
			case 7:
				lightCount += 3;
				break;
			case 8:
				lightCount += 7;
				break;
		}
		
		switch(one) {
			case 0:
			case 6:
			case 9:
				lightCount += 6;
				break;
			case 1:
				lightCount += 2;
				break;
			case 2:
			case 3:
			case 5:
				lightCount += 5;
				break;
			case 4:
				lightCount += 4;
				break;
			case 7:
				lightCount += 3;
				break;
			case 8:
				lightCount += 7;
				break;
		}
		
		return lightCount;*/
	}
}
