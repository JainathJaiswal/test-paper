package com.jai;

public class FactorialTest {

	public static void main(String[] args) {
		firstWay();
		secondWay();
		thirdWay();
		fourthWay();
		fifthWay();
	}

	public static void firstWay() {
		int fact = 1;
		int number = 4;
		for (int i = number; i > 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static void secondWay() {
		int i, fact = 1;
		int number = 4;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static void thirdWay() {
		int fact = 1;
		int number = 4;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void fourthWay() {
		long number = 4, fact = 1;
		int i = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static void fifthWay() {
		long number = 4, fact = 1;
		int i = 1;
		do {
			fact = fact * i;
			i++;
		} while (i <= number);
		System.out.println("Factorial of " + number + " is: " + fact);
		;
	}

}
