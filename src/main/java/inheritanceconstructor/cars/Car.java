package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        } else {
            this.fuel = fuel;
            this.tankCapacity = tankCapacity;
        }
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
            this.fuel += fuel;
        }


    public void drive(int km) {
        if (isTheFuelEnough(km)) {
            double consum = (km * fuelRate) / 100.0;
            modifyFuelAmount(-consum);
        }
    }

    private boolean isTheFuelEnough(int km){
        double consum = (km * fuelRate) / 100.0;
        if (consum > fuel){
            throw new RuntimeException("Not enough fuel available!");
            }
        return true;
    }

    public double calculateRefillAmount(){
        return tankCapacity - fuel;
    }
}
