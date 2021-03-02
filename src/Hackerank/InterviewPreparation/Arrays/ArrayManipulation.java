package Hackerank.InterviewPreparation.Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] array = new int[n];
        HashMap<Integer, Integer> indexValue = new HashMap<>();
        Integer max = 0;
        for (int operation = 0; operation < queries.length; operation++) {
            int number = queries[operation][2];
            int beginIndex = queries[operation][0];
            int endIndex = queries[operation][1];
            for(int i=beginIndex;i <= endIndex; i++) {
                int sum = 0;
                if (indexValue.get(i) != null) {
                    sum += indexValue.get(i) + number;
                    indexValue.put(i, indexValue.get(i) + number);
                } else {
                    sum +=number;
                    indexValue.put(i, number);
                }
                max = Math.max(max, sum);
            }
        }
//        for (int index=0; index < array.length;index++){
//            if(indexValue.get(index+1)!=null){
//                array[index] +=indexValue.get(index+1);
//            }
//        }
//        Arrays.sort(array);
        return max;
    }

    static long arrayManipulation1(int n, int[][] queries) {
        long[] computation = new long[n];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            computation[a] += k;
            if (b + 1 < n ) {
                computation[b + 1] -= k;
            }
        }

        long max = 0; long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }

        return max;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Enter size of array and number of operations: ");
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

//        long result = arrayManipulation(n, queries);
        long result = arrayManipulation1(n, queries);

        System.out.println(result);
        scanner.close();
    }
}

