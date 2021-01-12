package week11d02;

public class Ride {


    private int dayOfRide;
    private int numOfRide;
    private int distance;

    public Ride(int dayOfRide, int numOfRide, int distance) {
        this.dayOfRide = dayOfRide;
        this.numOfRide = numOfRide;
        this.distance = distance;
    }

    public int getDayOfRide() {
        return dayOfRide;
    }

    public int getNumOfRide() {
        return numOfRide;
    }

    public int getDistance() {
        return distance;
    }
}
