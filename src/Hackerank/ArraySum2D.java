package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraySum2D {


    // Complete the hourglassSum function below.
    //    a b c
    //      d
    //   e f g
    static int hourglassSum(int[][] arr) {
        HashMap<Integer, int[][]> hashMap = new HashMap();

        int max_hourglass_sum = -63;
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]+ arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max_hourglass_sum = Math.max(max_hourglass_sum, currentSum);
            }
        }
        return max_hourglass_sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }
}

//-9 -9 -9  1 1 1
// 0 -9  0  4 3 2
//-9 -9 -9  1 2 3
// 0  0  8  6 6 0
// 0  0  0 -2 0 0
// 0  0  1  2 4 0
