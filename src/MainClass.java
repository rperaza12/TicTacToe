import java.util.Scanner;

public class MainClass {
    
    
    public static char currentPlayer = 'X'; 

    public static void switchPlayer(){
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
    
    
    public static void main(String[] args) {

        System.out.println("Tic Tac toe Game" );
       
        Board.initBoard();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
             Board.displayBoard();

             //Get the move from player
             PlayerMove move = GetInput.getInput(keyboard, Board.getBoard(), currentPlayer);

            // Try placing the move
            boolean validMove = Board.updateBoard(move);

             if (!validMove) {
                System.out.println("Invalid move. Try again.");
                continue;
             }
            // Check for game over after a successful move
             if (Board.isGameOver()) {
                 Board.displayBoard(); //Shows the final state of the board
                 break;
                } 
                switchPlayer();
            }
        }   
       
        

    
}
        

          
        

      
    



