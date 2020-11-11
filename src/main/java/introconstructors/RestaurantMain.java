package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Korona", 10);
        System.out.println("Étterem: " + restaurant.getName());
        System.out.println("Férőhelyek száma: "+ restaurant.getCapacity());
        System.out.println("Menü: " + restaurant.getMenu());
    }
}
