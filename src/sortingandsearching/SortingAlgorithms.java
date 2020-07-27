package sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAlgorithms {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 1, 3, 2, 1, 4);
		// n-O(n) => if I add more element it will be slower;
		// n-O(n*n) => 2 - 4 ; 200 - 40000 count operation not time
		selectionSort(numbers);
		System.out.println(numbers);

		List<Integer> numbersForBubleSort = Arrays.asList(2, 3, 1, 3, 2, 1, 4);
		bubleSort(numbersForBubleSort);
		System.out.println(numbersForBubleSort);

		List<Integer> numbersForInsertionSort = Arrays.asList(2, 3, 1, 3, 2, 1, 4);
		insertionSort(numbersForInsertionSort);
		System.out.println(numbersForInsertionSort);
	}

	/*swap the first with the min element on the right then the second...
	 * O(1), no stable */
	private static void selectionSort(List<Integer> numbers) {
		for (int index = 0; index < numbers.size() - 1; index++) {
			int min = index;
			for (int current = index + 1; current < numbers.size(); current++) {
				if (numbers.get(current) < numbers.get(index)) {
					Collections.swap(numbers, current, index);
				}
			}
		}
	}

	//stable, best O(n)
	private static void bubleSort(List<Integer> numbers) {
		{
			for (int i = 0; i < numbers.size(); i++)
				for (int j = 0; j < numbers.size() - 1; j++)
					if (numbers.get(j) > numbers.get(j + 1)) {
						Collections.swap(numbers, j, j + 1);
					}
		}
	}

	//	simple but not effective best O(n)
//	ToDO check why not work
	private static void insertionSort(List<Integer> numbers) {
		for (int i = 1; i < numbers.size(); i++) {
			int key = numbers.get(i);
			int j = i - 1;
			while (j >= 0 && numbers.get(j) > key) {
				Collections.swap(numbers, j, i);
				j = j-1;
			}
			Collections.swap(numbers, key, j+1);
		}
	}
}
