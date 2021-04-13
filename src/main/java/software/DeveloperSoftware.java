package software;

public class DeveloperSoftware extends Software {

    public static final int DEVELOPER_PERCENTAGE = 10;

    public DeveloperSoftware(String name, double price) {
        super(name, price);
        increasePrice(DEVELOPER_PERCENTAGE);
    }

}
