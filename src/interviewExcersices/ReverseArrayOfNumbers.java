package interviewExcersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArrayOfNumbers<T> {

    public void reverseInPlace(int array[]) {
        System.out.println("Array before reverse in place: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Array after reverse in place: " + Arrays.toString(array));
    }

    public void reverseArrayAsList(List numbers) {
        System.out.println("Array before reverse as list: " + numbers);

        for (int i = 0, j = numbers.size() - 1; i < j; i++) {
//            move one by one every element; push one position down the current element.
            numbers.add(i, numbers.remove(j));
        }
        System.out.println("After after reverse as list: " + numbers);

    }

    public void recursionReverseList(List<T> numbers) {
//        base case if the list is empty or on element
        if (numbers == null || numbers.size() <= 1) {
            return;
        }
//        remove fisrt element
        T value = (T) numbers.remove(0);

        recursionReverseList(numbers);
        numbers.add(value);
    }

    private void reverseWithCollection(String[] typesOfInsurance) {
        System.out.println("array before reverse in collection: " + Arrays.toString(typesOfInsurance));
        List listOfProducts = Arrays.asList(typesOfInsurance);

//        O(n) complxity because use ListIterator of given list;
        Collections.reverse(listOfProducts);
        String[] reversed = (String[]) listOfProducts.toArray(typesOfInsurance);
        System.out.println("array after reverse in collection: " + Arrays.toString(reversed));

    }

    private Object[] invertUsingStreams(Object[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
    }


    public static void main(String[] args) {

        ReverseArrayOfNumbers reverseArrayOfNumbers = new ReverseArrayOfNumbers();
        int[] array = {1, 2, 3, 5, 6, 7};

        reverseArrayOfNumbers.reverseInPlace(array);

        List<Integer> numbers = new ArrayList(Arrays.asList("100", "200", "300", "400"));
        reverseArrayOfNumbers.reverseArrayAsList(numbers);

        List<Integer> numbers2 = new ArrayList(Arrays.asList("100", "200", "300", "400"));

        reverseArrayOfNumbers.recursionReverseList(numbers2);
        System.out.println("After recursion reverse list: " + numbers2);

        String[] typesOfInsurance = {"Cat", "Dog", "Elephant"};
        reverseArrayOfNumbers.reverseWithCollection(typesOfInsurance);

        String[] fruits = {"Cherry", "Pineapple", "Melon"};
        System.out.println("array before reverse: " + Arrays.toString(fruits) );

        System.out.println(Arrays.toString(reverseArrayOfNumbers.invertUsingStreams(fruits)));


    }


}
