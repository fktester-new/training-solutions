package meetingrooms;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return name.equals(p.getName());
    }

    public boolean codeCheck(Product p) {
        return Math.abs(code.length() - p.getCode().length()) <= 1;
    }

    public static void main(String[] args) {
        Product tea1 = new Product("Earl Grey", "1234");
        Product tea2 = new Product("Matcha", "1235");
        Product tea3 = new Product("Earl Grey", "123456");

        Product coffee1 = new Product("Espresso", "2345");
        Product coffee2 = new Product("Cappuccino", "2348");
        Product coffee3 = new Product("Cappuccino", "23481");

        System.out.println(tea1.getName() + " és " + tea2.getName() + " azonosak? " + tea1.areTheyEqual(tea2));
        System.out.println(coffee2.getName() + " és " + coffee3.getName() + " azonosak? " + coffee2.areTheyEqual(coffee3));
        System.out.println(coffee2.getName() + " és " + coffee3.getName() + " teljesen azonosak? " + coffee2.codeCheck(coffee3));
        System.out.println(tea1.getName() + " és " + tea3.getName() + " teljesen azonosak? " + tea1.codeCheck(tea3));
    }
}
