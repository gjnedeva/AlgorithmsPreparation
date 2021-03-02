package Hackerank.paysafe;

import java.io.IOException;
import java.util.Scanner;

public class NewPassword {

    /*
     * Complete the 'newPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String newPassword(String a, String b) {
        // Write your code here
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (b.length() == i) {
                newPassword.append(a.substring(i));
                break;
            }
                newPassword.append(a.charAt(i)).append(b.charAt(i));

        }
        if(a.length() < b.length()){
            newPassword.append(b.substring(a.length()));
        }
        return newPassword.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String a = scanner.nextLine();

            String b = scanner.nextLine();

        String result = NewPassword.newPassword(a, b);


    }
}

