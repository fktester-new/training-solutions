package week07d05;

public class Motorcycle extends Vehicle{

    private int numberOfGears;

    public Motorcycle(int numberOfGears){
        super(numberOfGears, TransmissionType.SEQUENTIAL);
    }


}
