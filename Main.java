import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Enter a number in the form of a String
        String str = scanner.nextLine();

        // Convert the string to an integer using the recursive function
        int result = stringToInteger(str);

        // Print the result
        System.out.println(result);
    }

    private static int stringToInteger(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int firstDigit = str.charAt(0) - '0';
        int remainingDigits = stringToInteger(str.substring(1));
        return firstDigit * (int) Math.pow(10, str.length() - 1) + remainingDigits;
    }
}
