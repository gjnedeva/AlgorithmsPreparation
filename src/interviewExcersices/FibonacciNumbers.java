package interviewExcersices;

import java.util.Scanner;

public class FibonacciNumbers {

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

    public int returnNFibonacciNumber(int n) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        for (int i = 1; i < n; ++i) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumbers fibonachiNumbers = new FibonacciNumbers();
        System.out.println("Enter n for n-th Fibonacci Number:");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        System.out.println(fibonachiNumbers.returnNFibonacciNumber(size));
        System.out.println(fibonachiNumbers.fibonacci(size));
    }
}
