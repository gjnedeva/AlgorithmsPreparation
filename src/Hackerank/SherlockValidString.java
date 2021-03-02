package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockValidString {

    // Complete the isValid function below.
//    All char
//    Sherlock considers a string to be valid if all characters of the string appear the same number of times.
//    It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur
//    the same number of times.
//    Given a string , determine if it is valid. If so, return YES, otherwise return NO.

    static String isValid(String s) {
        HashMap<Character, Integer> frequence_map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (frequence_map.get(key) != null) {
                frequence_map.put(key, frequence_map.get(key) + 1);
            } else {
                frequence_map.put(key, 1);
            }
        }
        ArrayList<Integer> values = new ArrayList<>(frequence_map.values());
        int maxFrequence = (int) Collections.max(values);
        int minFrequence = (int) Collections.min(values);
        if (minFrequence == maxFrequence) return "YES";

        int min_value = 0;
        int max_value =0;
        for (int i=0; i< values.size(); i++){
            if(values.get(i) == maxFrequence){
                max_value ++;
            }else if(values.get(i) == minFrequence){
                min_value++;
            }
            else{
                return "NO";
            }
        }
        if (min_value == 1 || (max_value == 1 && maxFrequence == minFrequence + 1)) {
            return "YES";
        } else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println(result);

        scanner.close();
    }
}



