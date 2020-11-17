package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.isEven(15));
        System.out.println(operators.isEven(50));

        System.out.println(Integer.toBinaryString(255));
        System.out.println(Integer.parseInt("333", 8));
        System.out.println(0333);
        System.out.println(0xFF);

        System.out.println(16 >> 1);// /2
        System.out.println(16 << 1);// *2
        System.out.println(13 >> 1);
        System.out.println(13 << 1);

        System.out.println(operators.multiplyByPowerOfTwo(10, 5));

        operators.convert();
        operators.cannotConvert();
    }
}
