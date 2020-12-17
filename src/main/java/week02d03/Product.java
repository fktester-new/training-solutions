package week02d03;

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
    public boolean areTheyEqual(Product product){

        boolean areNamesEqual = name.equals(product.getName());
        boolean areCodeLengthOk = Math.abs(code.length() - product.getCode().length()) <= 1;
        return areNamesEqual && areCodeLengthOk;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        Product product = new Product("kifli", "345");
        Product product1 = new Product("kifli", "34567");
        Product product2 = new Product("kifli", "3456");

        System.out.println(product.areTheyEqual(product1));
        System.out.println(product.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product2));

    }
}
