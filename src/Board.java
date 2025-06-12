

public class Board {
 public static char[][] board = new char[3][3];

 public static char[][] getBoard(){
    return board;
 }

public static void initBoard() {
        // This method sets the r or c as blank
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }
    //Add a class-level doc comment explaining what the Board class is for.

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "| " + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+--+--");
        System.out.println("  1  " + board[1][0] + "| " + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+--+--");
        System.out.println("  2  " + board[2][0] + "| " + board[2][1] + "|" + board[2][2]);
        System.out.println("    0  1  2 ");
    }

    // The method checks if there is a winner and returns X or 0 if winner is found otherwise ' ' 
    public static char checkWinner(){
        for (int row = 0; row < 3; row++) {
                if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
                   return board[row][0];
                }
    }
        for (int col = 0; col < 3; col++) {
                if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ') {
                    return board[0][col];
                }
            }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                return board[0][0];
            }
                   if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                return board[0][2];
            }
            return ' ';
        }
        
        public static boolean isBoardFull(){
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row][col] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isGameOver(){
            
            char winner = checkWinner();
            if (winner != ' ') {
                System.out.println("The winner is : " + winner);
                return true;
            }
            if (isBoardFull()) {
                System.out.println("It's a tie!");
                return true;
            }
            return false;
  
        }


        public static boolean updateBoard(PlayerMove move){
            int row = move.row;
            int col = move.col;
            //char symbol = move.player;

            if (board[row][col] != ' ') {
                 System.out.println("Cell already taken use another one"); // Ill move to main when coordinating how the main is gonna work 
            } else{
                board [row][col] = move.player;
                return true;
            }
            return false;
           
        }

        
    //End 
    }







   

