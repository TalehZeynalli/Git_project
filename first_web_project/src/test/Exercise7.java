package test;

import java.util.Scanner;


public class Exercise7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.print("cumleni daxil edin:");
	String cumle=scan.nextLine();
    for(int i=cumle.length()-1;i>=0;i--){
    	System.out.print(cumle.charAt(i));
    	
    }	
	}
	


}
