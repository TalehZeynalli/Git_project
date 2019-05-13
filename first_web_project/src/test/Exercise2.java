package test;


 
import java.util.HashMap;
 
public class Exercise2 {
    
    public static void main(String[] args) {
        String test="Merhaba Dünya yazısıdır 1231";
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int max=0;
        for (int i = 0; i < test.length(); i++) {
            if(!hmap.containsKey(test.charAt(i)))
            {
                  hmap.put(test.charAt(i),1); 
            }
            else
            {
                int count= (int)hmap.get(test.charAt(i));
                hmap.put(test.charAt(i),count+1);
            }    
        }

        for (char c : hmap.keySet()) {
            if (max == 0 || hmap.get(c) > max) {
                max = hmap.get(c);
            }
        }

        for (Character o : hmap.keySet()) {
            if (hmap.get(o).equals(max)) {
                System.out.println(o+" "+max);
            }
        }
       
    }
 
}
	

