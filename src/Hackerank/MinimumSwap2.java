package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        // 1, 4, 3, 2
        int swapCount = 0;
        boolean isVisited[] = new boolean[arr.length + 1];
        HashMap<Integer, Integer> nodeMap = new HashMap<Integer, Integer>();
        for (int i = 1; i < isVisited.length; i++) {
            nodeMap.put(i, arr[i - 1]);
        }

        for (int k = 1; k < nodeMap.size(); k++) {
            int nextNode;
            if (isVisited[k] == false) {
                isVisited[k] = true;
                if (k == nodeMap.get(k)) {
                    continue;
                } else {
                    int c = nodeMap.get(k);
                    while (!isVisited[c]) {
                        isVisited[c] = true;
                        nextNode = nodeMap.get(c);
                        c = nextNode;
                        ++swapCount;
                    }
                }
            }
        }
        return swapCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);

        scanner.close();
    }
}

