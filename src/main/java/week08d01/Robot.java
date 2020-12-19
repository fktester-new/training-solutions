package week08d01;

public class Robot {

private Position position = new Position(0, 0);

public Position move(String directions){
    directions = directions.toUpperCase();
    for (int i = 0; i < directions.length(); i++){
        moveOneStep(directions.charAt(i));
    }
    return this.position;
    }

    public Position getPosition() {
        return position;
    }

    public void moveOneStep(char c){
        switch(c) {
            case 'F': {
                position.increaseY();
                return;
            }
            case 'L': {
                position.decreaseY();
                return;
            }
            case 'B': {
                position.decreaseX();
                return;
            }
            case 'J': {
                position.increaseX();
                return;
            }
            default:
                throw new IllegalArgumentException("Unknown movement!");
        }
    }
}
