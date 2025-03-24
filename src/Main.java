import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("!!! Welcome to the Tic Tac Toe game !!!");
        char[][] board = new char[3][3];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                board[y][x] = '#';
            }
        }

        for(char[] i : board) {
            System.out.println(i);
        }
    }
}
