package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Bill bill = new Bill();

        bill.addItem(new Item("Milk", 2, 220));
        bill.addItem(new Item("Apple", 5, 400));
        bill.addItem(new Item("Butter", 4, 650));

        System.out.println("Fizetendő: " + bill.calculateTotalPrice() + " Ft");
    }
}
