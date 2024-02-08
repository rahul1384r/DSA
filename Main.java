import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the Sudoku grid
        System.out.print("Enter the size of the Sudoku grid (N): ");
        int N = scanner.nextInt();

        // Input Sudoku grid
        int[][] sudokuGrid = new int[N][N];
        System.out.println("Enter the Sudoku grid values:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sudokuGrid[i][j] = scanner.nextInt();
            }
        }

        // Solve and print the Sudoku grid
        if (solveSudoku(sudokuGrid, N)) {
            System.out.println("Sudoku Solution:");
            printSudokuGrid(sudokuGrid, N);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }

    // Function to solve the Sudoku puzzle using backtracking
    private static boolean solveSudoku(int[][] grid, int N) {
        int[] emptyCell = findEmptyCell(grid, N);

        // If no empty cell is found, Sudoku is solved
        if (emptyCell == null) {
            return true;
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        // Try filling the empty cell with digits 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num, N)) {
                // Place the digit if it's safe
                grid[row][col] = num;

                // Recursively try to fill the next empty cell
                if (solveSudoku(grid, N)) {
                    return true;
                }

                // If placing the digit didn't lead to a solution, backtrack
                grid[row][col] = 0;
            }
        }

        // No digit from 1 to 9 can be placed, backtrack to the previous state
        return false;
    }

    // Helper function to find an empty cell in the Sudoku grid
    private static int[] findEmptyCell(int[][] grid, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Helper function to check if a digit can be placed at a given position
    private static boolean isSafe(int[][] grid, int row, int col, int num, int N) {
        return !usedInRow(grid, row, num, N) &&
               !usedInCol(grid, col, num, N) &&
               !usedInBox(grid, row - row % 3, col - col % 3, num, N);
    }

    // Helper function to check if a digit is used in the given row
    private static boolean usedInRow(int[][] grid, int row, int num, int N) {
        for (int j = 0; j < N; j++) {
            if (grid[row][j] == num) {
                return true;
            }
        }
        return false;
    }

    // Helper function to check if a digit is used in the given column
    private static boolean usedInCol(int[][] grid, int col, int num, int N) {
        for (int i = 0; i < N; i++) {
            if (grid[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    // Helper function to check if a digit is used in the 3x3 box
    private static boolean usedInBox(int[][] grid, int startRow, int startCol, int num, int N) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    // Helper function to print the Sudoku grid
    private static void printSudokuGrid(int[][] grid, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
