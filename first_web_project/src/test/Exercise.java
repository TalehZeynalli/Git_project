package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Exercise {
	
	// Java-da 100000 təsadüfi ədədlərin daxilində hansı ədəddən neçə dənə
		// olduğunu tapan console proqramı qurmaq. Bu təsadüfi ədədlərin seçim
		// aralığı 1-100 arası olmalıdır.
	public static void main(String[] args) {
		int randomNumbers[]=new int[1000];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			Random random=new Random();
			randomNumbers[i]=random.nextInt(100)+1;
			
			
		}
		
		Map<Integer, Integer> countNumber= new HashMap<>();
		for (int key : randomNumbers) {
        if (countNumber.containsKey(key)){
        	int tekrar=countNumber.get(key);
        	tekrar++;
        	countNumber.put(key, tekrar);
        	
        }else {
			countNumber.put(key, 1);
		}
 {
			
		}			
			
		}
		
		for (int key : countNumber.keySet()) {
			int tekrar=countNumber.get(key);
			System.out.println("Ədəd:"+key+" "+"təkrar sayı:"+tekrar);
		}
		
	}
	
		
}
	



