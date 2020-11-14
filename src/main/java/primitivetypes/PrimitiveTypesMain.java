package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1000));
        System.out.println(new PrimitiveTypes().toBinaryString(1000));

        System.out.println(new Integer(1) + new Integer(2)); //3, auto unboxing
    }

}
