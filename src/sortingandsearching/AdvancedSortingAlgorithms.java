package sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedSortingAlgorithms {
	//	effecient, parallelizable,
	//	O(n*log(n)) = > fatser than O(n*n)
		//	// Merges two subarrays of arr[].
	//    // First subarray is arr[l..m]
	//    // Second subarray is arr[m+1..r]
	private static void mergeSort(List numbers, int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int size1 = m - l + 1;
		int size2 = r - m;

		/* Create temp arrays */
		List<Integer> listOne = new ArrayList<>(size1);
		List<Integer> listTwo = new ArrayList<>(size2);

		/*Copy data to temp arrays*/
		for (int i = 0; i < size1; ++i)
			listOne.get(i) = numbers.get(l + i);
		for (int j = 0; j < size2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < size1 && j < size2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < size1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < size2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	private static void sort(List numbers, int l, int r) {
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
		List<Integer> numbers = Arrays.asList(12, 1, 23, 14, 2, 5, 20, 30);
		sort(numbers, 0, numbers.size() - 1);
	}
}
