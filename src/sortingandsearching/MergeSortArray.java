package sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortArray {
    //	effecient, parallelizable,
    //	O(n*log(n)) = > fatser than O(n*n)
    //	// Merges two subarrays of arr[].
    //    // First subarray is arr[l..m]
    //    // Second subarray is arr[m+1..r]
    private static void mergeSort(int numbers[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int size1 = m - l + 1;
        int size2 = r - m;

        /* Create temp arrays */
        int[] listOne = new int[size1];
        int[] listTwo = new int[size2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < size1; ++i) {
            listOne[i] = numbers[l + i];
        }
        for (int j = 0; j < size2; ++j) {
            listTwo[j] = numbers[m + j + 1];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < size1 && j < size2) {
            if (listOne[i] <= listTwo[j]) {
                numbers[k] = listOne[i];
                i++;
            } else {
                numbers[k] = listTwo[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < size1) {
            numbers[k] = listOne[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < size2) {
            numbers[k] = listTwo[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    private static void sort(int numbers[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(numbers, l, m);
            sort(numbers, m + 1, r);

            // Merge the sorted halves
            mergeSort(numbers, l, m, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 2, 10, 13, 6, 5, 7};
        System.out.println("Given array:" + Arrays.toString(arr));

        MergeSortArray mergeSortArray = new MergeSortArray();
        mergeSortArray.sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}
