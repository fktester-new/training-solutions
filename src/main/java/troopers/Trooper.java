package troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if (isEmpty(name)){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target){

        if (target == null){
            throw new IllegalArgumentException("The new position must not be null!");
        }
        this.position = target;
    }

    public double distanceFrom(Position target){
        return this.position.distanceFrom(target);
    }

    private boolean isEmpty(String name){
        return name == null || "".equals(name);
    }
}
