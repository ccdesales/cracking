package com.cesarcd.ch1;

import java.util.HashMap;
import java.util.Map;

public class PalindromPermutationChecker {
	
	public boolean isPermutationOfPalindrom(final String string) {
		if (string == null || string.length() == 0) {
			return true;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i<string.length(); i++) {
			Character c = new Character(string.charAt(i));

			Integer count = getNextCount(map, c);
			
			map.put(c, count);
		}
		
		int oddCount = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
		    Integer value = entry.getValue();
		    Integer modulo = value % 2;
		    
		    if(modulo % 2 == 1) {
		    		oddCount++;
		    }
		}
		
		if(oddCount > 1) {
	    		return false;
	    }
		
		return true;
	}
	
	private Integer getNextCount(Map<Character, Integer> map, Character c) {
		Integer count = map.get(c);
		if (count == null) {
			count = new Integer(0);
		}
		
		return ++count;
	}
	
}
