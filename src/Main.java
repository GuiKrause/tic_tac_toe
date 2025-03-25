import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[3][3];

        String boardLimit = "---+---+---";

        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }

        System.out.println("!!! Welcome to the Tic Tac Toe game !!!\n");

        System.out.print("    ");
        System.out.println(" 1   2   3 ");
        System.out.println();
        System.out.printf("A %4s | %s | %s \n", board[0][0], board[0][1], board[0][2]);
        System.out.print("   ");
        System.out.printf(" %s \n", boardLimit);
        System.out.printf("B %4s | %s | %s \n", board[1][0], board[1][1], board[1][2]);
        System.out.print("   ");
        System.out.printf(" %s \n", boardLimit);
        System.out.printf("C %4s | %s | %s \n", board[2][0], board[2][1], board[2][2]);

        scanner.close();
    }
}