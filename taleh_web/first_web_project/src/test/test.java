package test;

public class test {
	 public static void main(String[] args) {
	        // Değişkenler tanımlanıyor.
	      String soz="Talehdgdfg";
	      String tekrarherf="";
	        System.out.print("Sayı giriniz: ");
	        
	    
	        // Alınan değerin harflerini tek tek diziye atıyoruz.
	        String[] sozler = soz.split("");
	        for (int i = 0; i < sozler.length; i++) {
				
	        	hif (sozler[i].equals(sozler[i+1])) {
					 tekrarherf=sozler[i];
				}
			}
	        
	     System.out.println(tekrarherf);
	        
	        
	    }

}
