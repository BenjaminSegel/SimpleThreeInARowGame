public class Player {
    private int count;
    private char marker;

    public Player(char marker){
        this.count = 0;
        this.marker = marker;
    }

    public char getMarker() {
        return marker;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
}
