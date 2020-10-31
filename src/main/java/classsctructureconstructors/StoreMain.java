package classsctructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store hwStore = new Store("Intel CPU");
        hwStore.store(15);

        System.out.println(hwStore.getProduct() + ": " + hwStore.getStock());

        Store plantStore = new Store("Apple tree");
        plantStore.store(50);

        System.out.println(plantStore.getProduct() + ": " + plantStore.getStock());

        hwStore.dispatch(5);
        plantStore.dispatch(25);
        plantStore.store(10);
        hwStore.store(20);

        System.out.println(hwStore.getProduct() + ": " + hwStore.getStock());
        System.out.println(plantStore.getProduct() + ": " + plantStore.getStock());

    }
}
