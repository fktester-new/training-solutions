package week03d02;

public class Employee {

    private String name;
    private int bonus;

    public Employee(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position=" + name +
                ", bonus= " + bonus;
    }
}

