public class PlayerMove {
int row;
int col;
char player;

public PlayerMove(int row, int col, char player){
    this.row = row;
    this.col = col;
    this.player = player;
}

// Used when Java prints ClassName@Hash we can display
public String toString() {
return  "Player " + player + " Selected Row " + row  + " and Selected Column " 
    + col;
}

}
