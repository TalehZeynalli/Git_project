package test;
import java.util.Scanner;

public class DiskriminantHesapla {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a;
		int b;
		int c;
		 
		System.out.println("A ededini daxil edin ");
		a=s.nextInt();
		System.out.println("B ededini daxil edin");
		b=s.nextInt();
		System.out.println("C ededini daxil edin");
		c=s.nextInt();
		double diskriminant=hesabla(a, b, c);
		controldiskriminant(diskriminant);
		
		
	}
	public static double hesabla(int a, int b,int c){
		
		double diskriminant=Math.pow(b, 2)- 4*a*c;
		
		
		return diskriminant;
		
		
	}
	public static void controldiskriminant(double diskriminant){
		if(diskriminant>0){
			System.out.println("2 musbet kok vardir."+diskriminant);
			
		}
		else if(diskriminant==0){
			System.out.println("2 eyni kok varsir" + diskriminant);
			
		}
		else{
			System.out.println("kok yoxdur");
		}
		
		
		
	}
	
			

}
