package com.hcl;

public class Reverse {
		public static String modifiedString(String string) {
			StringBuffer sb = new StringBuffer(string);
			StringBuffer sb2 = new StringBuffer();
			String string2 = sb.reverse().toString();
			for (int i = 0; i < string2.length(); i++) {
				sb2.append(string2.charAt(i));
				sb2.append("-");
			}
			sb2.deleteCharAt(sb2.length() - 1);
			System.out.println(sb2.toString());
			return sb2.toString();
		}
	}

