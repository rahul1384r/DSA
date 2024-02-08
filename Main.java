import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        hanoi(N, 'A', 'B', 'C');
    }

    private static void hanoi(int N, char A, char B, char C) {
        if (N == 1) {
            System.out.println("Move 1 from " + A + " to " + B);
            return;
        }
        hanoi(N - 1, A, C, B);
        System.out.println("Move " + N + " from " + A + " to " + B);
        hanoi(N - 1, C, B, A);
    }
}