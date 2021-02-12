package week15d05;

public class Battle {

    private String house;
    private int number;

    public Battle(String house, int number) {
        this.house = house;
        this.number = number;
    }

    public String getHouse() {
        return house;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return house + ", " + number;
    }
}
