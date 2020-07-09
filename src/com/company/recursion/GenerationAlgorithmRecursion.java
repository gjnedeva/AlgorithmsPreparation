package com.company.recursion;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class GenerationAlgorithmRecursion {
	static void Generate(int index, int[] vector) {
		if (index >= vector.length) {
			System.out.println(Arrays.toString(vector));
		} else {
			for (int i = 0; i <= 1; i++) {
				vector[index] = i;
				Generate(index + 1, vector);
			}
		}
	}

	public static void main(String[] args) {
		int[] vector = new int[8];
		Generate(0, vector);
	}
}
