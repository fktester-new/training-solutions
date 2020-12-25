package troopers;

public class Position {

    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position position){
        return Math.sqrt((posX - position.getPosX()) * (posX -position.getPosX()) + (posY - position.getPosY()) * (posY - position.getPosY()));
    }
}
