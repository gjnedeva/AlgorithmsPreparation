package com.company.recursion;

import org.apache.commons.lang3.StringUtils;


import java.util.Scanner;

class RecursionApp {
	//	not use recursion for sum because recursion is heavier than for. It will copy the values.
	private static int Sum(int[] arr, int index) {
		//put base case for stop it
		if (index == arr.length) {
			return 0;
		}
		System.out.println("Before recursion:" + index);

		int currentSum = arr[index] + Sum(arr, index + 1);

		System.out.println("After recursion:" + index);

		return currentSum;
	}

	static void Print(int index) {
		//put base case for stop it
		if (index == 0) {
			return;
		}
		System.out.println(StringUtils.repeat('*', index));

		Print(index - 1);

		System.out.println(StringUtils.repeat('#', index));


	}

	private static long Factorial(int num) {
		if (num == 0) { /* base case */
			return 1;
		}
		return num * Factorial(num - 1);
	}

	private static long IteralFactoria(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	private static int FibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return (FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2));
		}
	}

	private static int FibonacciIterative(int n) {
		int num1 = 0, num2 = 1;
		int result = 0;
		for (int i = 1; i < n; ++i) {
			result = num1 + num2;
			num1= num2;
			num2 = result;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{1, 2, 3, 4, 5};
		int sum = Sum(numbers, 0);
		System.out.println(sum);

//        calculate factorial
		Scanner myInput = new Scanner(System.in);

		System.out.print("Enter factorial integer: ");
		int factorial = myInput.nextInt();
		System.out.println(Factorial(factorial));

		System.out.println("Print factorial with iteration:" + IteralFactoria(factorial));
//      print * and # from recursion
		Print(5);

		/*expected result 34 */
		System.out.println("Print Fibonacci: " + FibonacciRecursive(9));
		System.out.println("Print Iterative: " + FibonacciIterative(9));
	}
}
