package week07d05;

public class Car extends Vehicle{

    private int numberOfGears;

    public Car(int numberOfGears){
        super(numberOfGears, TransmissionType.AUTOMATIC);
    }

}
