package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {

        WhichType whichType = new WhichType();

        System.out.println(whichType.whichType(Long.toString(Long.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Integer.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Short.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Byte.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString(1000)));

        System.out.println();
        System.out.println(whichType.whichType(Long.toString(Long.MIN_VALUE + 2)));
        System.out.println(whichType.whichType(Long.toString((long)Integer.MIN_VALUE + 50000000)));
        System.out.println(whichType.whichType(Long.toString((long)Short.MIN_VALUE + 32680)));
        System.out.println(whichType.whichType(Long.toString((long)Byte.MIN_VALUE + 2)));

    }



}
