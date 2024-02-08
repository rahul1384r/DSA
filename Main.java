import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        System.out.print("Enter the number of test cases (T): ");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input size of the array
            int N = scanner.nextInt();

            // Input array elements
            int[] arr = new int[N];
            System.out.println("Enter the array elements for test case " + (t + 1) + ":");
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Calculate and print the maximum number of points
            int maxPoints = getMaxPoints(arr);
            System.out.println("Maximum number of points for test case " + (t + 1) + ": " + maxPoints);
        }
    }

    // Function to calculate the maximum number of points
    private static int getMaxPoints(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        int maxPoints = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                maxPoints++;
            }
        }

        return maxPoints;
    }
}
