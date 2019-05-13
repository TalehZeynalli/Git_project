package test;

import java.util.Scanner;

public class Exercise5 { 
    public static void main(String[] args) { 
    int check=0;
   Scanner scan=new Scanner(System.in);
   System.out.println("Ededi daxil edin:");
   int i=scan.nextInt();
    	
			
    		for (int j = 2; j <= i/2; j++) {
    			
    			if (i%j ==0) {
    				  check++;
					break;
				}
			}	 
    			 	 if (check==0) {
				System.out.println(i+" sade ededir");
		}
    			 	 else{
    			 		 System.out.println("eded sade deyil");
    			 	 }
    	
} 
}
	



