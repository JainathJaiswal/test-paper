package com.jai;

public class StringReverseTest {

	public static void main(String[] args) {
		firstWay();
		secondWay();
		thirdWay();
	}

	public static void firstWay() {
		System.out.println("Reversed Word: " + reverseString("Hello"));
	}

	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void secondWay() {
		String str = "This";
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println("Reversed Word: " + rev);
	}

	public static void thirdWay() {
		String word = "This String will be getting reversed";
		String reversedWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord = reversedWord + word.charAt(i);
		}
		System.out.println("Reversed Word: " + reversedWord);
	}
}
