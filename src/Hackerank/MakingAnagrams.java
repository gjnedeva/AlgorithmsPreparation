package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {


    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int[] a_counter = new int[26];
        int[] b_counter = new int[26];
        int min_delete_char = 0;
        for (int i = 0; i < a.length(); i++) {
            char current_char = a.charAt(i);
            int current_char_int = (int) current_char;
            int position = current_char - (int) 'a';
            a_counter[position]++;
        }
        for (int i = 0; i < b.length(); i++) {
            char current_char = b.charAt(i);
            int current_char_int = (int) current_char;
            int position = current_char - (int) 'a';
            b_counter[position]++;
        }
        for (int i = 0; i < 26; i++) {
            int frequence = Math.abs(a_counter[i] - b_counter[i]);
            min_delete_char += frequence;
        }
        return min_delete_char;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);

        scanner.close();
    }
}

