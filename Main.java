public class Main {

        public static int countTwins(String str, int idx) {
            // Base case: if the string is empty or idx is at the end
            if (idx >= str.length() - 2) {
                return 0;
            }
    
            // Check for a twin at the current idx
            if (str.charAt(idx) == str.charAt(idx + 2)) {
                return 1 + countTwins(str, idx + 1);
            } else {
                // If no twin at the current idx, move to the next idx
                return countTwins(str, idx + 1);
            }
        }
    
        public static void main(String[] args) {
            // Example usage:
            String str = "AxAxA";
            int result = countTwins(str, 0);
            System.out.println("Number of twins: " + result);
        }
    }
    
