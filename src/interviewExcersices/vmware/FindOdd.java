package interviewExcersices.vmware;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FindOdd {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) throws IOException {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        if(l > r ){
            throw new IOException("Not valid range");
        }
        for (int i = l; i<=r; i++){
            if (i%2 !=0){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = FindOdd.oddNumbers(l, r);
        System.out.println(result);
        bufferedReader.close();
    }
}
