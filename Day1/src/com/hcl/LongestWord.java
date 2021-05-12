package com.hcl;
import java.util.StringTokenizer;

public class LongestWord {

	public String getLongestWord(String sentence) {
		int max = 0;
		StringTokenizer st = new StringTokenizer(sentence, " ");
		while (st.hasMoreTokens()) {
			String string = st.nextToken();
			int num1 = string.length();
			if (num1 > max) {
				max = num1;
				sentence = string;
			}
		}
		return sentence;
	}
/*	public String getLongestWord(String sentence) {
		// TODO Auto-generated method stub
		return null;

}*/
	
}

