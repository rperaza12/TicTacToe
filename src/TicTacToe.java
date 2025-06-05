import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X'; 
    

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tic Tac toe Game" );
        initBoard();

        while (true) {
           displayBoard();
            getInput(keyboard);

            if (isGameOver()) {
                displayBoard();
                break;
            }
                switchPlayer();
        }
            keyboard.close();
    }   

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "| " + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+--+--");
        System.out.println("  1  " + board[1][0] + "| " + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+--+--");
        System.out.println("  2  " + board[2][0] + "| " + board[2][1] + "|" + board[2][2]);
        System.out.println("    0  1  2 ");
    }

    public static void getInput(Scanner keyboard) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn.");
    
            // Validate row input
            while (true) {
                System.out.print("Choose row (0-2): ");
                if (keyboard.hasNextInt()) {
                    row = keyboard.nextInt();
                    if (row >= 0 && row < 3) {
                        break; // Valid row, exit loop
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
    
            // Check if the chosen position is available
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break; // Valid move, exit loop
            } else {
                System.out.println("That spot is already taken! Try again.");
            }
        }
    }
    

            public static void switchPlayer(){
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

        

        public static boolean isGameOver() {
            // Call checkWin() inside this method to check if a winner has been found
            for (int row = 0; row < 3; row++) {
                if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
                    System.out.println("Player " + board[row][0] + " Wins!");
                    return true;
                }
            }
            for (int col = 0; col < 3; col++) {
                if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ') {
                    System.out.println("Player " + board[0][col] + " Wins!");
                    return true;
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                System.out.println("Player " + board[0][0] + " Wins!");
                return true;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                System.out.println("Player " + board[0][2] + " Wins!");
                return true;
            }
        
            // Check if the board is full (tie condition)
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row][col] == ' ') {
                        return false; // Game is still playable
                    }
                }
            }
            System.out.println("It's a tie!");
            return true;
            
        }
        

    }
        

          
        

      
    



