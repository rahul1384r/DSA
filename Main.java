import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        // Input array elements
        int[] arr = new int[N];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        
        // b.) Print the groups when a successful split is found
        System.out.println("Groups for a successful split:");
        printEqualSumGroups(arr, 0, 0, 0, "", "");
        // a.) Count the number of ways to split the array
        int waysCount = countEqualSumGroups(arr, 0, 0, 0);
        System.out.println(waysCount);
    }

    // a.) Recursive function to count the number of ways to split the array
    private static int countEqualSumGroups(int[] arr, int index, int sum1, int sum2) {
        if (index == arr.length) {
            return (sum1 == sum2) ? 1 : 0;
        }

        int ways = 0;
        ways += countEqualSumGroups(arr, index + 1, sum1 + arr[index], sum2);
        ways += countEqualSumGroups(arr, index + 1, sum1, sum2 + arr[index]);

        return ways;
    }

    // b.) Recursive function to print groups for a successful split
    private static void printEqualSumGroups(int[] arr, int index, int sum1, int sum2, String group1, String group2) {
        if (index == arr.length) {
            if (sum1 == sum2) {
                System.out.println(group1 + "and " + group2);
            }
            return;
        }

        printEqualSumGroups(arr, index + 1, sum1 + arr[index], sum2, group1 + arr[index] + " ", group2);
        printEqualSumGroups(arr, index + 1, sum1, sum2 + arr[index], group1, group2 + arr[index] + " ");
    }
}
