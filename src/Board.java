public class Board {
 private static char[][] board = new char[3][3];

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

        public static void main(String[] args) {
           
            displayBoard();
            isGameOver();
          
        }

        
    //End 
    }







   

