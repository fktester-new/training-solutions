package week08d01;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increaseX() {
        x++;
    }

    public void decreaseX(){
        x--;
    }

    public void increaseY() {
        y++;
    }

    public void decreaseY(){
        y--;
    }
}


