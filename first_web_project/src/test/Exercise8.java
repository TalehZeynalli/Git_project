package test;

import java.util.Scanner;

//ededi tersden yazdirmaq
public class Exercise8 {
	public static void main(String[] args) {
		System.out.print("Ededi daxil edin:");
		Scanner scan=new Scanner(System.in);
		int eded=scan.nextInt();
		System.out.print("Ededin tersi:");
		while (eded>0) {
			int pille=eded%10;
			 System.out.print(pille);
			eded=eded/10;
			
		}
		 
		

	}

}
