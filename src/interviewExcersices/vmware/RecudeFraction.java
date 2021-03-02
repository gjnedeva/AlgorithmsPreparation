package interviewExcersices.vmware;

import java.io.*;
import java.util.*;

public class RecudeFraction {

    /*
     * Complete the 'ReduceFraction' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY fractions as parameter.
     */

    public static List<String> ReduceFraction(List<String> fractions) {
        // Write your code here
        List<String> result = new ArrayList<>(fractions.size());
        for (int i = 0; i < fractions.size(); i++) {
            String[] temp = fractions.get(i).split("/");
            int number1 = Integer.parseInt(temp[0]);
            int number2 = Integer.parseInt(temp[1]);

            int greatestCommonNumber = greatestCommonNumber(number1, number2);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(number1/greatestCommonNumber).append('/').append(number2/greatestCommonNumber);
            result.add(stringBuilder.toString());
        }

        return result;
    }

    static int greatestCommonNumber(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }else{
            return greatestCommonNumber(number2, number1%number2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int fractionsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> fractions = new ArrayList<>();

        for (int i = 0; i < fractionsCount; i++) {
            String fractionsItem = bufferedReader.readLine();
            fractions.add(fractionsItem);
        }

        List<String> result = RecudeFraction.ReduceFraction(fractions);


        System.out.println(result);

        bufferedReader.close();
    }
}


