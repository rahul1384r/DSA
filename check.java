import java.util.Scanner;

public class check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the board (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of faces of the dice (M): ");
        int M = scanner.nextInt();

        int result = countWaysToTravel(N, M);
        System.out.println("Count of different ways to travel the board: " + result);
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
}
