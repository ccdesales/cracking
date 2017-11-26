package com.cesarcd.ch1;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharsDetector {
	
	public boolean hasUniqueChars(final String input) {
		Set<Character> hm = new HashSet<Character>();
		
		for(int i=0; i < input.length(); i++) {
			Character current_char = new Character(input.charAt(i));
			
			if (hm.contains(current_char)) {
				return false;
			} else {
				hm.add(current_char);
			}
		}
		return true;
	}
}
