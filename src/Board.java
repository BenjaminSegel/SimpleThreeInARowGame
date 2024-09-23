import java.util.Scanner;

    class Board {
       private char[][] board;
       Scanner sc = new Scanner(System.in);
       private char marker;
       private int round;
    

       public Board() {
           int nextChar = 0;
           this.round = 0;
           this.board = new char[3][3];
           System.out.print("Welcome to Three-in-a-row." + System.lineSeparator());
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
               }
           }
       }
    public void printBoard() {
        System.out.println("---------");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j < 2){
                System.out.print(board[i][j] + " | ");
                }else{
                System.out.print(board[i][j]);
                }
            }
            System.out.println(" ");
        }
        System.out.println("---------");
    }
        public void boardHandler(){
        Player playerOne = new Player('X');
        Player playerTwo = new Player('O');
        Game newGame = new Game();
           while(!newGame.inGame()){
               newGame.incRound();
               if((newGame.getRound() & 1) == 0){
                   marker = playerOne.getMarker();
               }else{
                   marker = playerTwo.getMarker();
               }
               System.out.println("Enter the coordinates of the row: ");
               int row = sc.nextInt();
               System.out.println("Enter the coordinates of the column: ");
               int col = sc.nextInt();
               int x = row - 1;
               int y = col - 1;
               if(board[x][y] == '-'){
                   this.board[x][y] = marker;
                   System.out.println("row: " + x + " column: " + y);
               }else{
                   System.out.println("That coordinate is occupied. Try again.");
                   round --;
               }
               if(checkRowWin(marker) || checkColumnWin(marker) || checkDiagonalWin(marker)){
                newGame.playerWon();
                System.out.println("Winner: " + marker);
               }
               printBoard();
           }
    }

    public boolean checkRowWin(char marker){
        for(int i = 0; i < 3; i++){
            if(board[i][0] == marker && 
            board[i][1] == marker && 
            board[i][2] == marker){
                return true;
            }
        }
        return false;
    }

    public boolean checkColumnWin(char marker){
        for(int i = 0; i < 3; i++){
            if(board[0][i] == marker && 
            board[1][i] == marker && 
            board[2][i] == marker){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkDiagonalWin(char marker){
        
            if(board[0][0] == marker && 
            board[1][1] == marker && 
            board[2][2] == marker){
                return true;
            }else if(board[0][2] == marker && 
            board[1][1] == marker &&
             board[2][3] == marker){
                return true;
             }
        
        return false;
    }
    
}

