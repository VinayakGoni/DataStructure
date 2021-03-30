package com.infosys.lex;

public class ReverseStringRecursively {
	static String str = "";

	public static void main(String[] args) {

		reverseString("vinayak");
		System.out.println(str);
	}

	private static void reverseString(String string) {

		int length = string.length();
		if (length > 0) {
			str = str.concat(String.valueOf(string.charAt(length - 1)));
			reverseString(string.substring(0, length - 1));
		}
	}

}
