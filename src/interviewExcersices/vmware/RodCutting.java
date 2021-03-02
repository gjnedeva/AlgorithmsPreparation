package interviewExcersices.vmware;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RodCutting {

    /*
     * Complete the 'rodOffcut' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY lengths as parameter.
     */

    //[1,1,3,4]
    //4,2,1
    public static List<Integer> rodOffcut(List<Integer> lengths) {
        // Write your code
        List<Integer> offcutsArray = new ArrayList<>();
        offcutsArray.add(lengths.size());

        int offCuts = 0;
        int min_element = Collections.min(lengths);

        for (int i = 0; i < lengths.size(); i++) {
            if (lengths.get(i).equals(min_element)) {
                lengths.remove(i);
                i--;
                offCuts++;
            }
        }
            for (int j = 0; j < lengths.size(); j++) {
                int currentState = lengths.get(j) - min_element;
                lengths.set(j, currentState);
                min_element = Collections.min(lengths);
            }

            offcutsArray.add(offCuts);

        return offcutsArray;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int lengthsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> lengths = new ArrayList<>();

        for (int i = 0; i < lengthsCount; i++) {
            int lengthsItem = Integer.parseInt(bufferedReader.readLine().trim());
            lengths.add(lengthsItem);
        }

        List<Integer> result = RodCutting.rodOffcut(lengths);
        System.out.println(result);

        bufferedReader.close();
    }
}

