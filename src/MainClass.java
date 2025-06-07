import java.util.Scanner;

public class MainClass {

   
    public static char currentPlayer = 'X'; 
    

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


    public static void switchPlayer(){
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
    
}
        

          
        

      
    



