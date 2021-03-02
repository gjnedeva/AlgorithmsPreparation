package Hackerank.paysafe;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class WeightString {

    /*
     * Complete the 'smallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER weight as parameter.
     */

    public static String smallestString(long weight) {
        // Write your code here
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashSet<Integer> weights = new HashSet<>();
        return "A";
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long weight = Long.parseLong(scanner.nextLine());

        String result = smallestString(weight);

        System.out.println(result);
    }
}

