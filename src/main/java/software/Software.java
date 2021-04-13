package software;

public abstract class Software {


    private String name;
    private double price;

    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void increasePrice(int percentage){
        price += price * (percentage / 100.0);
    }
}
