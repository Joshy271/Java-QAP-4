import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        try (Scanner scan = new Scanner(System.in)) {
            // Get word from user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine();

            // Convert to all upper case
            word = word.toUpperCase();

            // Count frequency of each letter in string
            for (int i = 0; i < word.length(); i++) {
                try {
                    counts[word.charAt(i) - 'A']++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Catch the exception and don't do anything (ignore non-letter characters)
                    // Print a useful message for non-letter characters
                    char nonLetterChar = word.charAt(i);
                    System.out.println("'" + nonLetterChar + "' is not a letter.");
                }
            }
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}