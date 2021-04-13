package software;

public class OfficeSoftware extends Software {


    public static final int OFFICE_PERCENTAGE = 5;

    public OfficeSoftware(String name, double price) {
        super(name, price);
        increasePrice(OFFICE_PERCENTAGE);
    }

}
