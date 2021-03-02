package Hackerank.InterviewPreparation.Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
//    input:
//    6 4
//give me one grand today night
//give one grand today
//    output: Yes, No

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            System.out.println("No");
            return;
        }
        HashMap<String, Integer> wordsCounter = new HashMap<>();
        for (int counter = 0; counter < magazine.length; counter++) {
            String word = magazine[counter];
            if (wordsCounter.get(word) == null) {
                wordsCounter.put(word, 1);
            } else {
                wordsCounter.put(word, wordsCounter.get(word) + 1);

            }
        }
        for (int counter = 0; counter < note.length; counter++) {
            String wordInMessage = note[counter];
            if (wordsCounter.get(wordInMessage) != null && wordsCounter.get(wordInMessage) != 0) {
                wordsCounter.put(wordInMessage, wordsCounter.get(wordInMessage) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

