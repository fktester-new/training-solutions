package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel){
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    private boolean isTheFuelEnoughJeep(int km){
        return  ((super.getFuel() + extraFuel) - km * super.getFuelRate() / 100.0) >= 0;
    }

    public void drive(int km){
        if (! isTheFuelEnoughJeep(km)){
            throw new RuntimeException("Not enough fuel available!");
        }
        double consum = km * super.getFuelRate() / 100.0;
        extraFuel -= consum;
        if (extraFuel < 0){
            super.modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    public double calculateRefillAmount(){
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
