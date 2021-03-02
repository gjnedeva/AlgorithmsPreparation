package Hackerank.paysafe;

import java.io.IOException;
import java.util.Scanner;

public class ClosedPath {



    /*
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

        public static int closedPaths(int number) {
            // Write your code here
            int sum = 0;
            String numberToString = Integer.toString(number);
            for (int i = 0; i < numberToString.length(); i++) {
                int test = numberToString.charAt(i) - '0';
                if (test == 8) {
                    sum += 2;
                }
                if (test == 0 || test == 4 || test == 6 || test == 9) {
                    sum += 1;
                }
            }
            return sum;
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = ClosedPath.closedPaths(number);


    }


}
