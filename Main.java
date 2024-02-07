import java.util.Scanner;

public class Main {
    private static int count = 0;

    private static void printBoard(int[] board, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("{" + (i + 1) + "-" + (board[i] + 1) + "} ");
        }
        System.out.print(" ");
    }

    private static boolean placeQueens(int[] board, int row, int n) {
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row] = col;
                if (row == n - 1) {
                    printBoard(board, n);
                    count++;
                } else {
                    if (placeQueens(board, row + 1, n)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isValid(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || (i - row) == (board[i] - col) || (i - row) == (col - board[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] board = new int[n];
        placeQueens(board, 0, n);
        System.out.println();
        System.out.println(count);
    }
}