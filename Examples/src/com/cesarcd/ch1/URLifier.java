package com.cesarcd.ch1;

public class URLifier {
	public String urlify(String ss, int realLenght) {
		char[] arr = ss.toCharArray();
		
		int j = 0;
		
		for (int i=0; i<realLenght; i++) {
			char c = ss.charAt(i);
			
			if (c == ' ') {
				arr[j++] = '%';
				arr[j++] = '2';
				arr[j++] = '0';
			} else {
				arr[j++] = c;
			}
		}

		return new String(arr);
	}

}
