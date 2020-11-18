package numbers;

public class Circle {

    private int diameter;
    public static final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public double perimeter(int diameter) {
        return diameter * PI;
    }

    public double area(int diameter){
        return (diameter * diameter * PI) / 4;
    }
}
