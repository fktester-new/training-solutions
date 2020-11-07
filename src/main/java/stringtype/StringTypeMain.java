package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message + 444;

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String s = "" + "";
        System.out.println(s);

        System.out.println(s.length());

        String sample = "Abcde";
        System.out.println(sample.length());

        System.out.println(sample.substring(0,1) + " , " + sample.substring(2,3));
        System.out.println(sample.charAt(0) + " , " + sample.charAt(2));

        System.out.println(sample.substring(0,3));


    }
}
