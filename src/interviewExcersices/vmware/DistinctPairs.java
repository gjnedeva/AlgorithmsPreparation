package interviewExcersices.vmware;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//give array with n- number and d -> sum of two pair
//have to return pairs which sum is D without use one element twice
// [ 2, -4, 7, 3, 5, 10, 6], target sum = 9
// [6, 3], [7, 2]
public class DistinctPairs {

    public static void main(String args[] ) throws Exception {

        int arr[] = {2, -4, 7, 3, 5, 10, 6};

        DistinctPairs distinctPairs  = new DistinctPairs() ;
        distinctPairs.distinctPairs(arr, 9);


        ArrayList<ArrayList<Integer>> couples = sumToN(arr, 9);

        for(ArrayList<Integer> summedArrays:couples) {
            for(Integer a:summedArrays){
                System.out.println(a);
            }
            System.out.println("|||||||||||||");
        }
    }

    public void distinctPairs(int[] arr, int k) {
        int length = arr.length;
        int count = 0;
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == k) {
                    if (!(pairs.containsKey(arr[j]) && pairs.containsValue(arr[i]))) {
                        pairs.put(arr[i], arr[j]);
                    }
                }
            }
            count = pairs.size();
            System.out.println("Pairs are " + pairs + "  count  = " + count);
        }
    }

    static ArrayList<ArrayList<Integer>> sumToN(int arr[], int summed) {
        ArrayList<ArrayList<Integer>> everySummedCouple = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i< arr.length-1; i++) {
            for(int j=i+1; j< arr.length; j++) {
                if(arr[i] + arr[j] == summed) {
                    ArrayList<Integer> summedCouple = new ArrayList<Integer>();
                    summedCouple.add(arr[i]);
                    summedCouple.add(arr[j]);
                    everySummedCouple.add(summedCouple);
                }
            }
        }
        return everySummedCouple;
    }


}