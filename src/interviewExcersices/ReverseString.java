package interviewExcersices;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ReverseString {

    protected void reverseString(String inputString) {
        char[] reverseString = inputString.toCharArray();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(reverseString[i]);
        }
        System.out.println(" ");

    }

    protected void reverseInput(String input) {
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length-1-i];
        }
        System.out.println(new String(result));

    }

    //    protected void printString(char[] reverseStrign){
//        System.out.println("Reverse String:");
//        for (int j = 0; j< reverseStrign.length; j++){
//            System.out.print(reverseStrign[j]);
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write string for reverse:");
        String inputString = scanner.nextLine();

        System.out.println("Original string: " + inputString);
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(inputString);

        reverseString.reverseInput(inputString);

    }
}
