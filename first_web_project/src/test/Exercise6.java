package test;

import java.util.Scanner;

public class Exercise6 {
	 public static void onluqdanikiyekec(int eded){
	int binary[]=new int[100];
	int index=0;
	
	while (eded>0) {
		binary[index++]=eded%2;
		eded=eded/2;
		
	}
	for (int i = index-1; i>=0; i--) {
		System.out.print(binary[i]);
		
	}
	 
	
   }      
 public static void main(String [] args){
	 System.out.println("ededi daxil edin");
	 
	     Scanner sc=new Scanner(System.in);
	     int eded=sc.nextInt();
	     onluqdanikiyekec(eded);
	     
	     
	 
	  }
}

