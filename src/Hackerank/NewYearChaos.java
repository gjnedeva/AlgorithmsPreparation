package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//initial position incremented by 1
// if n= 8 Person 5 brides Person 4 => 1 2 3 5 4 6 7 8

//Complete the function minimumBribes in the editor below.
// It must print an integer representing the minimum number of bribes necessary,
// or Too chaotic if the line configuration is not possible.
public class NewYearChaos {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
        int swapCount = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != i + 1) {
                if (((i - 1) >= 0) && arr[i - 1] == (i + 1)) {
                    swapCount++;
                    swap(arr, i, i-1);
//                    Collections.swap(Arrays.asList(arr), i, i - 1);
                } else if ((i - 2 >= 0) && arr[i - 2] == (i + 1)) {
                    swapCount += 2;
                    swap(arr, i-2, i-1);
                    swap(arr, i-1, i);
//                    Collections.swap(Arrays.asList(arr), i - 2, i - 1);
//                    Collections.swap(Arrays.asList(arr), i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    private static void swap (int[] a , int i, int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
