import java.util.Scanner;
public class GetInput {
    

    public static PlayerMove getInput(Scanner keyboard, char[][] board, char currentPlayer) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn.");
    
            // Validate row input
            while (true) {
                System.out.print("Choose row (0-2): ");
                if (keyboard.hasNextInt()) {
                    row = keyboard.nextInt();
                    if (row >= 0 && row < 3) {
                        break;
                    }
                } else {
                    keyboard.next(); // Clear invalid input
                }
                System.out.println("Invalid row! Must be between 0 and 2.");
            }
    
            // Validate column input
            while (true) {
                System.out.print("Choose column (0-2): ");
                if (keyboard.hasNextInt()) {
                    col = keyboard.nextInt();
                    if (col >= 0 && col < 3) {
                        break; // Valid column, exit loop
                    }
                } else {
                    keyboard.next(); // Clear invalid input
                }
                System.out.println("Invalid column! Must be between 0 and 2.");
            }
            // Board Checks availability to place the move
            if (board[row][col] == ' ') {
                break; 
            } else {
                System.out.println("That spot is already taken! Try again.");
            }
            // End
        }
        return new PlayerMove(row, col, currentPlayer);
        
    }
}
