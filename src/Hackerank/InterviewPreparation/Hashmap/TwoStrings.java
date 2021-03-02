package Hackerank.InterviewPreparation.Hashmap;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {

        // Complete the twoStrings function below.
        static String twoStrings(String s1, String s2) {
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for (int i = 0; i < alphabet.length; i++) {
                if (s1.indexOf(alphabet[i]) > -1 && s2.indexOf(alphabet[i]) > -1) {
                    return "YES";
                }
            }
            return "NO";
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s1 = scanner.nextLine();

                String s2 = scanner.nextLine();

                String result = twoStrings(s1, s2);

            }

            scanner.close();

            String str1 = "abc";
            String str2 = "abc";
            String str3 = new String("abc");
            System.out.println("str1=str2 ?" + (str1 == str2) + ",");
            System.out.println("str1=str3 ?" + (str1==str3) +",");
            System.out.println("str1 eq str3 ?" + (str1.equals(str3)));
        }
    }

