import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A single number
        int number = scanner.nextInt();
        ArrayList<String> result = getAllStrings(number, "");
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }
    }

    private static ArrayList<String> getAllStrings(int number, String currentString) {
        ArrayList<String> result = new ArrayList<>();

        // Base case: If the number is 0, add the current string to the result
        if (number == 0) {
            result.add(currentString);
            return result;
        }

        // Case 1: Take a single digit
        int lastDigit = number % 10;
        if (lastDigit != 0) {
            char correspondingChar = (char) ('A' + lastDigit - 1);
            result.addAll(getAllStrings(number / 10, correspondingChar + currentString));
        }

        // Case 2: Take two digits if applicable
        if (number >= 10 && number % 100 <= 26) {
            int lastTwoDigits = number % 100;
            char correspondingChar = (char) ('A' + lastTwoDigits - 1);
            result.addAll(getAllStrings(number / 100, correspondingChar + currentString));
        }

        return result;
    }
}
