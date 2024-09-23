public class Game {
    private int round;
    private boolean hasWinner;

    public Game(){
        this.round = 0;
        this.hasWinner = false;
    }
    
    public void incRound(){
        round++;
    }
    public int getRound(){
        return round;
    }
    public void playerWon(){
        hasWinner = true;
    }
    public boolean inGame(){
        return hasWinner;
    }

}
