package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
        System.out.println(CircleCalculator.PI);

        CircleCalculator circleCalculator = new CircleCalculator();

        System.out.println(circleCalculator.calculatePerimeter(10));
        System.out.println(circleCalculator.calculateArea(10));

        CylinderCalculator cylindercalculator = new CylinderCalculator();

        System.out.println(cylindercalculator.calculateSurfaceArea(10, 20));
        System.out.println(cylindercalculator.calculateVolume(10, 20));

    }
}
