package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    // How many characters should be deleted for not repeating
    static int alternatingCharacters(String s) {
        int min_deletion_char = 0;
        //AABBCC -> 3
        //ABCD -> 0;
        for (int i = 0; i < s.length()-1; i++) {
          if (s.charAt(i) == s.charAt(i + 1)) {
                min_deletion_char++;
            } else {
                continue;
            }
        }
        return min_deletion_char;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            System.out.println(result);
        }

        scanner.close();
    }
}
