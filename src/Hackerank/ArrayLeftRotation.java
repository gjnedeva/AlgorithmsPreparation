package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        //1 2 3 4 5
        //2 3 4 5 1

        int[] rotatedArray = new int[a.length];
        int i=0;
        int rotedIndex = d;

        while (rotedIndex < a.length){
            rotatedArray[i] = a[rotedIndex];
            i++;
            rotedIndex++;
        }
        rotedIndex = 0;

        while (rotedIndex < d ){
            rotatedArray[i] = a[rotedIndex];
            i++;
            rotedIndex++;
        }

        return rotatedArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Write size of array and left rotation size:");
        String[] nd = scanner.nextLine().split(" ");

        int size = Integer.parseInt(nd[0]);

        int rotationSize = Integer.parseInt(nd[1]);

        System.out.println("Enter the array:");
        int[] intArray = new int[size];

        String[] stringArray = scanner.nextLine().split(" ");

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (stringArray.length > size || stringArray.length < size) {
            throw new Exception("Incorrecr size of array");
        }

        if (rotationSize > size) {
            throw new Exception("Incorrecr size of rotation");
        }
        for (int i = 0; i < size; i++) {
            int aItem = Integer.parseInt(stringArray[i]);
            intArray[i] = aItem;
        }

        int[] result = rotLeft(intArray, rotationSize);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}

