package com.company;

class RecursionApp {
    //	not use recursion for sum because recursion is heavier than for. It will copy the values.
    private static int Sum(int[] arr, int index) {
        //put base case for stop it
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + Sum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int sum = Sum(numbers, 0);
        System.out.println(sum);
    }
}