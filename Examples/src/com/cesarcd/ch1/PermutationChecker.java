package com.cesarcd.ch1;

import java.util.HashMap;
import java.util.Map;

public class PermutationChecker {
	
	private Integer getNextCount(Map<Character, Integer> map, Character c) {
		Integer count = map.get(c);
		if (count == null) {
			count = new Integer(0);
		}
		
		return ++count;
	}
	
	public boolean isPermutationOf(final String stringA, final String stringB) {
		if (stringA.length() != stringB.length()) {
			return false;
		}
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for (int i=0; i<stringA.length(); i++) {
			Character c1 = new Character(stringA.charAt(i));
			Character c2 = new Character(stringB.charAt(i));
			
			Integer count1 = getNextCount(map1, c1);
			Integer count2 = getNextCount(map2, c2);
			
			map1.put(c1, count1);
			map2.put(c2, count2);
		}
		
		if (map1.size() != map2.size()) {
			return false;
		}
				
		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			Character key1 = entry.getKey();
		    Integer value1 = entry.getValue();
		    
		    if (!map2.containsKey(key1)) {
		    		return false;
		    }
		    
		    
		    if (value1 != map2.get(key1)) {
		    		return false;
		    }
		}
		
		// all stored characters had the same count
		return true;
	}
}
