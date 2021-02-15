package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.contains(passenger.getName()) || passengers.size() >= boat.getMaxPassengers()) {
            throw new IllegalArgumentException("The passenger has already booked or there is no free place!");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger){
        return passenger.getCruiseClass().getValue() * basicPrice;
    }

    public Passenger findPassengerByName(String name){
        for (Passenger passenger : passengers) {
            if (name.equals(passenger.getName())){
                return passenger;
            }
        }
        throw new IllegalArgumentException("The name is not found!");
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
