import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // a.) Count 'hi'
        int count = countHi(str);
        System.out.println("Count of 'hi' (excluding 'hit'): " + count);
        
        // b.) Remove 'hi'
        String removedHiString = removeHi(str);
        System.out.println("String with 'hi' removed (excluding 'hit'): " + removedHiString);
        
        // c.) Replace 'hi' with 'bye'
        String replacedHiString = replaceHi(str);
        System.out.println("String with 'hi' replaced by 'bye' (excluding 'hit'): " + replacedHiString);
    }

    // a.) Recursive function to count 'hi'
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("hi") && (str.length() == 2 || str.charAt(2) != 't')) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    // b.) Recursive function to remove 'hi'
    public static String removeHi(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.startsWith("hi") && (str.length() == 2 || str.charAt(2) != 't')) {
            return removeHi(str.substring(2));
        } else {
            return str.charAt(0) + removeHi(str.substring(1));
        }
    }

    // c.) Recursive function to replace 'hi' with 'bye'
    public static String replaceHi(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.startsWith("hi") && (str.length() == 2 || str.charAt(2) != 't')) {
            return "bye" + replaceHi(str.substring(2));
        } else {
            return str.charAt(0) + replaceHi(str.substring(1));
        }
    }
}
