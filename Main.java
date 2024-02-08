import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] path = new int[N];  // Use an array instead of ArrayList
        printAllPaths(N, M, path, 0, 0);
        System.out.println();
        int result = countWaysToTravel(N, M);
        System.out.println(result);
    }

    static int countWaysToTravel(int N, int M) {
        return helper(0, N, M);
    }

    static int helper(int position, int N, int M) {
        if (position == N) {
            return 1;
        }
        if (position > N) {
            return 0;
        }

        int ways = 0;
        for (int i = 1; i <= M; i++) {
            ways += helper(position + i, N, M);
        }

        return ways;
    }


    static void printAllPaths(int N, int M, int[] path, int position, int index) {
        if (position == N) {
            printPath(path, index);
            return;
        }
        if (position > N) {
            return;
        }

        for (int i = 1; i <= M; i++) {
            path[index] = i;
            printAllPaths(N, M, path, position + i, index + 1);
        }
    }

    static void printPath(int[] path, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(path[i]);
        }
        System.out.print(" ");
    }
}
