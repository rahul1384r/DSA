import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Get lexicographically smaller words
        String[] smallerWords = getLexicographicallySmallerWords(str);

        // Print the result
        System.out.println("Lexicographically smaller words:");
        for (String word : smallerWords) {
            System.out.println(word);
        }
    }

    // Recursive function to get lexicographically smaller words
    private static String[] getLexicographicallySmallerWords(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return getLexicographicallySmallerWordsUtil("", new boolean[str.length()], chars, str);
    }

    private static String[] getLexicographicallySmallerWordsUtil(String current, boolean[] used, char[] sortedChars, String original) {
        if (current.length() == sortedChars.length) {
            if (current.compareTo(original) < 0) {
                return new String[]{current};
            }
            return new String[0];
        }

        String[] result = new String[0];
        for (int i = 0; i < sortedChars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                String[] smallerWords = getLexicographicallySmallerWordsUtil(current + sortedChars[i], used, sortedChars, original);
                used[i] = false;

                result = concatenateArrays(result, smallerWords);
            }
        }

        return result;
    }

    // Helper method to concatenate arrays
    private static String[] concatenateArrays(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}
