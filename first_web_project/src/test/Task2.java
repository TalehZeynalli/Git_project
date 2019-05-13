package test;
 
public class Task2 {
    
    public static void main(String[] args) {
        String value="menim adimmm talehdir 1231";
        char[] array = value.toCharArray();
        		int count = 1;
        		int max = 0;
        		char maxChar = 0;
        		for(int i=1; i<array.length; i++){ // Birdən etibarən bütün characterləri özündən öncəki ilə eyniliyini yoxluyur
        		    if(array[i]==array[i-1]){
        		        count++;
        		    } else {
        		        if(count>max){
        		            max=count;
        		            maxChar=array[i-1];
        		        }
//        		        count = 1;
        		    }
        		}
        		if(count>max){
        		    max=count;
        		    maxChar=array[array.length-1];
        		}
        		System.out.println("Longest run: "+max+", for the character "+maxChar);
    }
 
}