package com.example.domain;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
	
		String temp = "Men java axtarisindayam";
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		int count = 1;
		for (int i = 0; i < temp.length(); i++) {
			
			
			if (hmap.containsKey(temp.charAt(i))) {
				count=hmap.get(temp.charAt(i));
				hmap.put(temp.charAt(i), ++count);
				
			}else {
				hmap.put(temp.charAt(i), 1);
			}
			
			
		}
	
	
	}
}
