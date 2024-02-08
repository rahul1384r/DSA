import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Print lexicographically larger words
        printLexicographicallyLargerWords(str);
    }

    // Recursive function to print lexicographically larger words
    private static void printLexicographicallyLargerWords(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        printLexicographicallyLargerWordsUtil("", new boolean[str.length()], chars, str);
    }

    private static void printLexicographicallyLargerWordsUtil(String current, boolean[] used, char[] sortedChars, String original) {
        if (current.length() == sortedChars.length) {
            if (current.compareTo(original) > 0) {
                System.out.println(current);
            }
            return;
        }

        for (int i = 0; i < sortedChars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                printLexicographicallyLargerWordsUtil(current + sortedChars[i], used, sortedChars, original);
                used[i] = false;
            }
        }
    }
}
