package com.company.recursion;

import java.util.Arrays;

public class GenerateCombinationRecursion {

	private static void GenerateCombination(int[] set, int[] vector, int index, int border) {
		if (index >= vector.length) {
			//print vector
			System.out.println(Arrays.toString(vector));
		} else {
			for (int i = border; i < set.length; i++) {
				vector[index] = set[i];
				GenerateCombination(set, vector, index + 1, i);
			}
		}
	}

	public static void main(String[] args) {
		int[] set = new int[]{1, 2, 3, 4};
		int[] vector = new int [2];
		GenerateCombination(set,vector, 0,0 );
	}

}
