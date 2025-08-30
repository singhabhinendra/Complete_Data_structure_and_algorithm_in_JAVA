import java.util.HashSet;
import java.util.Scanner;

public class ValidSoduku {
    char[][] board = new char[9][9];

    public ValidSoduku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sudoku board (9 rows with 9 space-separated characters, use . for empty):");

        // take input row by row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.next().charAt(0);  // reads one token (e.g., "5", ".", "3")
            }
        }

        System.out.println("Valid Sudoku? " + isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (seen.contains(c)) return false;
                    seen.add(c);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            HashSet<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c != '.') {
                    if (seen.contains(c)) return false;
                    seen.add(c);
                }
            }
        }
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (c != '.') {
                            if (seen.contains(c)) return false;
                            seen.add(c);
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        new ValidSoduku();
    }
}
