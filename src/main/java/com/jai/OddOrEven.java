package com.jai;

public class OddOrEven {
	public static void main(String args[]) {
		int num = 4;
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

		if (isEven(num)) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

	static boolean isEven(int n) {
		boolean isEven = true;

		for (int i = 1; i <= n; i++)
			isEven = !isEven;

		return isEven;
	}
}
