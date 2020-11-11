package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    public static final int SEATS = 4;

    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * SEATS;
        this.menu = generateMenu();
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    private List<String> generateMenu() {
        return Arrays.asList("Rántott gombafejek rizzsel és tartárral", "Bolognai spagetti", "Lasagne");
    }
}
