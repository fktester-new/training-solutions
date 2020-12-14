package week08d01;

import java.util.Locale;

public class Robot {

private Position position = new Position(0, 0);

public Position move(String directions){
    directions = directions.toUpperCase();
    for (int i = 0; i < directions.length(); i++){
        char c = directions.charAt(i);
       Move.c.step(position);
    }
    return this.position;
    }

    public Position getPosition() {
        return position;
    }
}
