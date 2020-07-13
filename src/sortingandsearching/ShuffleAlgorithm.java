package sortingandsearching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleAlgorithm {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		shuffle(numbers);
		System.out.println(numbers);
	}

	public static <T> void shuffle(List<T> source){
		Random rnd = new Random();
		for(int i = 0; i < source.size(); i++){
			int size = source.size() - 1;
			Collections.swap(source, i, rnd.nextInt(size));
		}
	}
}
