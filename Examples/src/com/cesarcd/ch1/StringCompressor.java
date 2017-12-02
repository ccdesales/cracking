package com.cesarcd.ch1;

import java.util.ArrayList;

public class StringCompressor {
	
	private void addToTokenList(ArrayList<String> sb, int currentCharCount, char currentChar) {
		String value = String.valueOf(currentChar);
		
		if (currentCharCount > 1) {
			sb.add(currentCharCount + value);
		} else {
			sb.add(value);
		}
	}
	
	public String compressString(final String input) {
		if (input == null || input.length() <= 1) {
			return input;
		}
		
		ArrayList<String> tokens = new ArrayList<String>();
		
		boolean isFirstPass = true;
		char currentChar = input.charAt(input.length() - 1);
		int currentCharCount = 1;
		for (int i = input.length()-1; i >= 0; i--) {
			if (isFirstPass) {
				isFirstPass = false;
				continue;
			}
					
			boolean isSameChar = currentChar == input.charAt(i);
			if (isSameChar) {
				currentCharCount++;
			} else {

				this.addToTokenList(tokens, currentCharCount, currentChar);
				
				currentChar = input.charAt(i);
				currentCharCount = 1;
			}
			
			if (i == 0) {
				this.addToTokenList(tokens, currentCharCount, currentChar);
			}
			
		}
		
		StringBuffer sb = new StringBuffer();
		for(int j = tokens.size() - 1; j >= 0; j--){
			sb.append(tokens.get(j));
		}
		
		System.out.println(sb);
		
		String compressed = sb.toString();
		
		if (compressed.length() >= input.length()) {
			return input;
		}
		
		return sb.toString();
	}
}
